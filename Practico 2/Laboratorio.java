
/**
 * Clase Laboratorio
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Laboratorio
{
    // variables de instancia
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor de la clase
     * 
     * @param   nombre, domicilio, telefono
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
    }
    
    /**
     * Constructor de la clase
     * 
     * @param   nombre, domicilio
     */
    public Laboratorio(String p_nombre, String p_domicilio) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
    }
    
    /**
     * Constructor de la clases
     * 
     * @param   nombre
     */
    public Laboratorio(String p_nombre) {
        this.setNombre(p_nombre);
    }
    
    /**
     * Devuelve el nombre
     * 
     * @return  nombre
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Establece el nombre
     * 
     * @param   nombre
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Devuelve el domicilio
     * 
     * @return  domicilio
     */
    public String getDomicilio() {
        return this.domicilio;
    }
    
    /**
     * Establece el domicilio
     * 
     * @param   domicilio
     */
    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }
    
    /**
     * Devuelve el telefono
     * 
     * @return  telefono
     */
    public String getTelefono() {
        return this.telefono;
    }
    
    /**
     * Establece el telefono
     * 
     * @param   telefono
     */
    private void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }
    
    /**
     * Devuelve la compra minima
     * 
     * @return  compra minima
     */
    public int getCompraMinima() {
        return this.compraMinima;
    }
    
    /**
     * Establece la compra minima
     * 
     * @param   compra minima
     */
    private void setCompraMinima(int p_compraMinima) {
        this.compraMinima = p_compraMinima;
    }
    
    /**
     * Devuelve el dia de entrega
     * 
     * @return dia de entrega
     */
    public int getDiaEntrega() {
        return this.diaEntrega;
    }
    
    /**
     * Establece el dia de entrega
     * 
     * @param   dia de entrega
     */
    private void setDiaEntrega(int p_diaEntrega) {
        this.diaEntrega = p_diaEntrega;
    }
    
    /**
     * Imprime por pantalla el nombre, domicilio y telefono
     */
    public void mostrar() {
        System.out.println("Laboratorio: " + this.getNombre());
        System.out.println("Domicilio: " + this.getDomicilio() + " - Telefono: " + this.getTelefono());
    }
}
