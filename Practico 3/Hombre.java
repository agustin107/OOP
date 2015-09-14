
/**
 * Clase Hombre
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Hombre
{
    // atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    /**
     * Constructor de la clase
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad)
    {
        // inicializo atributos
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
    }
    
    /**
     * Constructor de la clase
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposa(p_esposa);
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
    public String getApellido() {
        return this.apellido;
    }
    
    /**
     * 
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    
    /**
     * 
     */
    public int getEdad() {
        return this.edad;
    }
    
    /**
     * 
     */
    private void setEdad(int p_edad) {
        this.edad = p_edad;
    }
    
    /**
     * 
     */
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    /**
     * 
     */
    private void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }
    
    /**
     * 
     */
    public Mujer getEsposa() {
        return this.esposa;
    }
    
    /**
     * 
     */
    private void setEsposa(Mujer p_esposa) {
        this.esposa = p_esposa;
    }
    
    /**
     * 
     */
    public void casarseCon(Hombre p_hombre) {
        
    }
    
    /**
     * 
     */
    public void divorcio() {
        
    }
    
    /**
     * 
     */
    public String datos() {
        
    }
    
    /**
     * 
     */
    public void mostrarEstadoCivil() {
        
    }
    
    /**
     * 
     */
    public void casadoCon() {
        
    }
}
