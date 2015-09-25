import java.io.*;
import java.util.*;

/**
 * Write a description of class ArchivoLaboratorio here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class ArchivoLaboratorio
{
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        int codLab=0;
        String nombre = "";
        String domicilio="";
        String telefono="";
        int compraMinima=0;
        int diaEntrega=0;
        char opcion ='s'; 
        
        
        try{
            RandomAccessFile archi= new RandomAccessFile("D:\\Laboratorio.dat","rw");
            
            while(opcion =='s'){
                System.out.println("** DATOS DEL LABORATORIO **");
                
                System.out.print("Nombre: ");
                nombre=teclado.next();
                if(nombre.length()<30){
                    for(int i=nombre.length() ; i<30 ; i++){
                        nombre = nombre+" ";
                    }
                }else{
                    nombre = nombre.substring(0,29);
                }
                
                System.out.print("Domicilio: ");
                domicilio = teclado.next();
                if(domicilio.length() <30){
                    for(int i=domicilio.length() ; i<30 ; i++){
                        domicilio = domicilio+" ";
                    }
                }else{
                    domicilio = domicilio.substring(0,29);
                }
                
                System.out.print("Telefono: ");
                telefono = teclado.next();
                if(telefono.length()<30){
                    for(int i=telefono.length() ; i<30 ; i++){
                        telefono = telefono+" ";
                    }
                }else{
                    telefono.substring(0,29);
                }
                
                System.out.print("Compra Minima: ");
                compraMinima = teclado.nextInt();
                
                System.out.print("Dia entrega (valor en entero): ");
                diaEntrega = teclado.nextInt();
                
                //grabando el archivo
                if(archi.length()!=0){
                    archi.seek(archi.length()); //se posiciona al final del ultimo registro
                }
                
                Laboratorio unLaboratorio = new Laboratorio(nombre,domicilio,telefono);
                
                archi.writeInt(codLab);
                archi.writeChars(unLaboratorio.getNombre());
                archi.writeChars(unLaboratorio.getDomicilio());
                archi.writeChars(unLaboratorio.getTelefono());
                archi.writeInt(compraMinima);
                archi.writeInt(diaEntrega);
                
                System.out.println();
                System.out.print("Desea cargar mas laboratorios? (s/n): ");
                opcion = teclado.next().charAt(0);
                
                codLab = codLab++;
            }
            archi.close();
            
            System.out.println();
            System.out.println("Se genero el archivo Laboratorio.dat");
        }
        catch(FileNotFoundException fnfe){System.out.println("Archivo no encontrado.");}
        catch(IOException ioe){System.out.println("Error al escribir.");}
    }
}

