/**
 * Clase PruebaCliente que se encarga de probar y ejecutar la clase Cliente
 * 
 * @author Agustin N. R. Ramirez
 * @see Laboratorio
 * @version 1.0
 */
public class PruebaCliente
{
    /**
     * Entrada al programa para probar y ejecutar la clase Cliente
     * 
     * @param  args arreglo de string que contiene el dni, apellido, nombre e importe
     */
    public static void main(String[] args)
    {
        // Asigno a variables los datos ingresado por argumento
        int DNI = Integer.parseInt(args[0]);
        String apellido = args[1];
        String nombre = args[2];
        double saldo = Double.parseDouble(args[3]);
        
        // Declaro los objetos
        Cliente juan = new Cliente(24444333, "Perez", "Juan", 200);
        Cliente cliente = new Cliente(DNI, apellido, nombre, saldo);
        
        // Mando mensajes
        System.out.println("-------- Mensaje mostrar ---------");
        cliente.mostrar();
        juan.mostrar();
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje nuevoSaldo ---------");
        System.out.println("Nuevo saldo: " + cliente.nuevoSaldo(200));
        System.out.println("Nuevo saldo: " + juan.nuevoSaldo(300));
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje nomYApe ---------");
        System.out.println("Nombre y Apellido: "+ cliente.nomYApe());
        System.out.println("Nombre y Apellido: "+ juan.nomYApe());
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje apeYNom ---------");
        System.out.println("Apellido y Nombre: "+ cliente.apeYNom());
        System.out.println("Apellido y Nombre: "+ juan.apeYNom());
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje agregaSaldo ---------");
        System.out.println("Su saldo ahora es: " + cliente.agregaSaldo(500));
        System.out.println("Su saldo ahora es: " + juan.agregaSaldo(1000));
        System.out.println("----------------------------------");
    }
}
