import java.io.*;
/**
 * Write a description of class ImprimirArchiLab here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class ImprimirArchiLab
{
   public static void main(String [] args){
       int codLab =0;
       String nombre="";
       String domicilio ="";
       String telefono="";
       int compraMinima = 0;
       int diaEntrega = 0;
       
       try{
           FileInputStream archiFIS = new FileInputStream("D:\\Laboratorio.dat");
           DataInputStream archiDIS = new DataInputStream(archiFIS);
           
           System.out.println("Productos que contiene el Laboratorio.dat");
           while(archiDIS.available() > 0){
               codLab = archiDIS.readInt();
               nombre=archiDIS.readUTF();
               domicilio =archiDIS.readUTF();
               telefono=archiDIS.readUTF();;
               compraMinima = archiDIS.readInt();
               diaEntrega = archiDIS.readInt();
               
               Laboratorio unLaboratorio = new Laboratorio(nombre,domicilio,telefono,compraMinima,diaEntrega);
               System.out.println();
               System.out.println("Codigo: "+codLab);
               System.out.println("Nombre: "+unLaboratorio.getNombre());
               System.out.println("Domicilio: "+unLaboratorio.getDomicilio());
               System.out.println("Telefono: "+unLaboratorio.getTelefono());
               System.out.println("Compra Minima: "+unLaboratorio.getCompraMinima());
               System.out.println("Dia de entrega: "+unLaboratorio.getDiaEntrega());
               System.out.println("**************************");
               
               nombre="";
          }
          archiDIS.close();
      }   
       catch(FileNotFoundException fnfe){System.out.println("Archivo no encontrado.");}
       catch(IOException ioe){System.out.println("Error al leer");}
   }
}