
/**
 * Clase Laboratorio
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Laboratorio
{
    // atributos
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor de la clase
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        // inicializo los atributos
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }

    public Laboratorio(String p_nombre, String p_domicilio) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
    }
    
    public Laboratorio(String p_nombre) {
        this.setNombre(p_nombre);
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    public String getDomicilio() {
        return this.domicilio;
    }
    
    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    private void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }
    
    public int getCompraMinima() {
        return this.compraMinima;
    }
    
    private void setCompraMinima(int p_compraMinima) {
        this.compraMinima = p_compraMinima;
    }
    
    public int getDiaEntrega() {
        return this.diaEntrega;
    }
    
    private void setDiaEntrega(int p_diaEntrega) {
        this.diaEntrega = p_diaEntrega;
    }
    
    public void mostrar() {
        System.out.println("Laboratorio: " + this.getNombre());
        System.out.println("Domicilio: " + this.getDomicilio() + " - Telefono: " + this.getTelefono());
    }
}
