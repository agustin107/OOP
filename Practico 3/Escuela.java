
/**
 * Clase Escuela
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Escuela
{
    // atributos
    private String nombre;
    private String domicilio;
    private String director;

    /**
     * Constructor de la clase
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director)
    {
        // inicializo los atributos
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
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
        this.nombe = p_nombre;
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
     * Devuelve el director
     * 
     * @return  director
     */
    public String getDirector() {
        return this.director;
    }
    
    /**
     * Establece el director
     * 
     * @param   director
     */
    private void setDirector(String p_director) {
        this.director = p_director;
    }
    
    /**
     * Imprime un recibo con sus detalles
     * 
     * @param   docente
     */
    public void imprimirRecibo(Docente p_docente) {
        
    }
}
