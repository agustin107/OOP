import java.util.*;
/**
 * Write a description of class GerenteGral here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class GerenteGral
{ 
    public static void main(String[] args){
        Calendar fechaIngreso = new GregorianCalendar();
        fechaIngreso.set(1996, 9, 4);
        EmpleadoConJefe unEmpleado = new EmpleadoConJefe (2346, "Jorge", "Cuevas", 10000, fechaIngreso,null); 
        if(unEmpleado.esAniversario() == true){
            System.out.println("--------------------------------------------------------");
            System.out.println("Permiso de Salida concedido por Aniversario de Ingreso");
        }
        unEmpleado.mostrarPantalla();
    }
}