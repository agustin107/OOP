
/**
 * Clase Paciente
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Paciente
{
    // atributos
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    /**
     * Constructor de la clase
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive)
    {
        // inicializo atributos
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_localidadNacido);
        this.setLocalidadVive(p_localidadVive);
    }

    /**
     * 
     */
    public int getHistoriaClinica() {
        return this.historiaClinica;
    }
    
    /**
     * 
     */
    private void setHistoriaClinica(int p_historia) {
        this.historiaClinica = p_historia;
    }
    
    /**
     * 
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * 
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * 
     */
    public String getDomicilio() {
        return this.domicilio;
    }
    
    /**
     * 
     */
    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }
    
    /**
     * 
     */
    public Localidad getLocalidadNacido() {
        return this.localidadNacido;
    }
    
    /**
     * 
     */
    private void setLocalidadNacido(Localidad p_localidadNacido) {
        this.localidadNacido = p_localidadNacido;
    }
    
    /**
     * 
     */
    public Localidad getLocalidadVive() {
        return this.localidadVive;
    }
    
    /**
     * 
     */
    private void setLocalidadVive(Localidad p_localidadVive) {
        this.localidadVive = p_localidadVive;
    }
    
    /**
     * 
     */
    public void mostrarDatosPantalla() {
        
    }
    
    /**
     * 
     */
    public String cadenaDeDatos() {
        
    }
}
