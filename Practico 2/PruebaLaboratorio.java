/**
 * Clase PruebaLaboratorio que va a probar y ejecutar
 * la clase Laboratorio
 * 
 * @author Agustin N. R. Ramirez
 * @see Laboratorio
 * @version 1.0
 */
public class PruebaLaboratorio
{
    /**
     * Entrada al programa para probar y ejecutar la clase Laboratorio
     * 
     */
    public static void main(String[] args)
    {
        // Declaro los objetos
        Laboratorio colgate = new Laboratorio("Colgate S.A", "Junin 5204", "54-11 -4239-8447");
        Laboratorio clearMan = new Laboratorio("Clear Man S.A", "Hirigoyen 1212");
        Laboratorio kolyno = new Laboratorio("Kolyno S.A");
        
        // Mando mensajes
        System.out.println("-------- Mensaje mostrar ---------");
        colgate.mostrar();
        clearMan.mostrar();
        kolyno.mostrar();
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje getDiaEntrega ---------");
        System.out.println("Dia de entrega: " + clearMan.getDiaEntrega());
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje compraMinima ---------");
        System.out.println("Compra minima: " + kolyno.getCompraMinima());
        System.out.println("----------------------------------");
    }
}
