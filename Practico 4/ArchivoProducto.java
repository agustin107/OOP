import java.util.*;
import java.io.*;
/**
 * Write a description of class ArchivoProducto here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class ArchivoProducto
{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        char opcion = 's';
        
        System.out.println("Se cargaran productos al archivo...");
        
        //instancio un Laboratorio para poder instanciar un Producto.
        Laboratorio unLaboratorio = new Laboratorio("Pepe","1234");
        
        try{
            FileOutputStream archiFOS = new FileOutputStream ("D:\\Productos.dat",true);
            DataOutputStream archiDOS = new DataOutputStream(archiFOS);
            
            while(opcion == 's'){
            System.out.print("Codigo: ");
            int codigo = teclado.nextInt();
            System.out.print("Rubro: ");
            String rubro = teclado.next();
            System.out.println("Descripcion: ");
            String descripcion = teclado.next();
            System.out.print("Existencima Minima: ");
            int existMinima = teclado.nextInt();
            System.out.print("Porcentaje punto de reposicion: ");
            double ptoRepos = teclado.nextDouble();
            System.out.print("Stock: ");
            int stock = teclado.nextInt();
            System.out.print("Precio: ");
            double precio = teclado.nextDouble();
            System.out.print("Codigo Laboratorio: ");
            int codLab = teclado.nextInt();
            
            Producto unProducto = new Producto(codigo,rubro,descripcion,precio,ptoRepos,existMinima,unLaboratorio);
            
            archiDOS.writeInt(unProducto.getCodigo());
            archiDOS.writeUTF(unProducto.getRubro());
            archiDOS.writeUTF(unProducto.getDescripcion());
            archiDOS.writeInt(unProducto.getExistMinima());
            archiDOS.writeDouble(unProducto.getPorcPtoRepo());
            archiDOS.writeInt(stock);
            archiDOS.writeDouble(unProducto.getCosto());
            archiDOS.writeInt(codLab);
            
            System.out.print("Desea ingresar mas productos? (s/n): ");
            opcion = teclado.next().charAt(0);
           }
           
           archiDOS.close();
        }
        catch(FileNotFoundException fnfe){System.out.println("Archivo no encontrado");}
        catch(IOException ioe){System.out.println("Error de escritura");}
    }
}
