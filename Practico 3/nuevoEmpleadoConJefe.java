import java.util.*;
/**
 * Write a description of class nuevoEmpleadoConJefe here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class nuevoEmpleadoConJefe
{ 
    public static void main(String[] args){
        Calendar fechaIngreso = new GregorianCalendar();
        fechaIngreso.set(1996, 9, 4);
        Calendar fechaIngreso2 = new GregorianCalendar();
        fechaIngreso2.set(1988, 2, 5);
        EmpleadoConJefe unJefe = new EmpleadoConJefe (1456, "Hugo", "Flores", 30000, fechaIngreso2);
        EmpleadoConJefe unEmpleado = new EmpleadoConJefe (2346, "Jorge", "Cuevas", 10000, fechaIngreso,unJefe); 
        if(unEmpleado.esAniversario() == true){
            System.out.println("--------------------------------------------------------");
            System.out.println("Permiso de Salida concedido por Aniversario de Ingreso");
            System.out.println("Firma Jefe: " + " " + unJefe.nomYApe());
        }
        unEmpleado.mostrarPantalla();
    }
}