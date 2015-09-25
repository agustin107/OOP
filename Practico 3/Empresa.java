import java.util.*;
/**
 * Clase ejecutable Empresa
 * 
 */
public class Empresa
{ 
    public static void main(String[] args){
        Calendar fechaIngreso = new GregorianCalendar();
        fechaIngreso.set(1999, 9, 4);
        Empleado unEmpleado = new Empleado (2022, "Juan", "Castro", 9000, fechaIngreso);
        unEmpleado.mostrar(); 
        if(unEmpleado.esAniversario() == true){
            System.out.println("--------------------------------------------------------");
            System.out.println("Permiso de Salida concedido por Aniversario de Ingreso");
        }
    }
}
   