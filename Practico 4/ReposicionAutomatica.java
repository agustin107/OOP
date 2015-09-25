import java.util.*;
import java.io.*;

/**
 * Write a description of class ReposicionAutomatica here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class ReposicionAutomatica
{
    public static void main(String [] args){
        
        int contFaltanteStock = 0;
        int contPtoReposic = 0;
        double acumTotalCompra = 0;
        double montoCompra = 0;
        int tamReg = 102;
        
        try{
            FileInputStream archiProducto = new FileInputStream ("D:\\Productos.dat");
            DataInputStream regProducto = new DataInputStream(archiProducto);
            
            RandomAccessFile archiLab = new RandomAccessFile("D:\\Laboratorio.dat","r");
           
            
            Fecha fechaHoy = new Fecha();
            String nombreCompra = ("D:\\comprar_"+fechaHoy.getAnio()+fechaHoy.getMes()+fechaHoy.getDia()+".txt");
            FileOutputStream archiCompra = new FileOutputStream (nombreCompra,true);
            DataOutputStream regCompra = new DataOutputStream(archiCompra);
            
            System.out.println("Listado de productos a comprar al "+fechaHoy.verLetra());
            
            while(regProducto.available()>0){
                int codProducto = regProducto.readInt();
                String rubro = regProducto.readUTF();
                String descripcion = regProducto.readUTF();
                int existMinima = regProducto.readInt();
                double ptoRepos = regProducto.readDouble();
                int stock = regProducto.readInt();
                double precio = regProducto.readDouble();
                int codLab_1= regProducto.readInt();
                
                archiLab.seek(tamReg*codLab_1);
                
                int codLab_2 = archiLab.readInt();
                String nombre = "";
                for(int i=0 ; i<30 ; i++){
                    nombre = nombre + archiLab.readChar();
                }
                String domicilio = "";
                for(int i=0 ; i<30 ; i++){
                    domicilio = domicilio + archiLab.readChar();
                }
                String telefono = "";
                for(int i=0 ; i<30 ; i++){
                    telefono = telefono + archiLab.readChar();
                }
                int compraMinima = archiLab.readInt();
                int diaEntrega = archiLab.readInt();
                
                Laboratorio unLaboratorio = new Laboratorio(nombre,domicilio,telefono,compraMinima,diaEntrega);
                Producto unProducto = new Producto(codProducto,rubro,descripcion,precio,ptoRepos,existMinima,unLaboratorio);
                unProducto.ajuste(stock);
                
                if(unProducto.solicitar() != 'N'){
                    if(unProducto.solicitar() == 'F'){
                        contFaltanteStock++;
                    }else{ contPtoReposic++; }
                    
                    System.out.println("Producto: "+ unProducto.getDescripcion());
                    unLaboratorio.mostrar();
                    System.out.println("Cantidad a comprar: "+unLaboratorio.getCompraMinima()+"      Dia de entrega: "+unLaboratorio.diasParaEntregar()+" del mes");
                    System.out.println("-----------------------------------------------------------");
                    
                    montoCompra = (unProducto.getCosto()*unProducto.getExistMinima());
                    acumTotalCompra = acumTotalCompra + montoCompra;
                    
                    regCompra.writeInt(unProducto.getCodigo());
                    regCompra.writeInt(codLab_2);
                    regCompra.writeDouble(montoCompra);
                    regCompra.writeChar(unProducto.solicitar());
                }
            }
            
            regProducto.close();
            archiLab.close();
            regCompra.close();
            
            System.out.println("Numero de productos a reponer: "+ (contFaltanteStock+contPtoReposic));
            System.out.println("Importe total a la compra planificada: " + acumTotalCompra);
            System.out.println("Numero de compra por faltante de Stock: " + contFaltanteStock);
            System.out.println("Numero de compras por punto de reposicion: " + contPtoReposic);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Archivo creado: "+nombreCompra);
        }
        catch(FileNotFoundException fnfe){System.out.println("Archivo no encontrado");}
        catch(IOException ioe){
            System.out.println("Error al leer");
        }
    }
}
