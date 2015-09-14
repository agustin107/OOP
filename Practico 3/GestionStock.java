
/**
 * Clase GestionStock
 * 
 * @author Agustin N. R. Ramirez
 * @see Producto
 * @version 1.0
 */
public class GestionStock
{
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
        int codigo = 1234;
        String rubro = "Perfumeria";
        String descripcion = "Jabón Deluxe";
        double costo = 5.25;
        Laboratorio laboratorio = new Laboratorio("Colgate S.A", "Scalabrini Ortiz 5524", "54-11 -4239-8447");
        Producto producto = new Producto(codigo, rubro, descripcion, costo, laboratorio);
    }
}
