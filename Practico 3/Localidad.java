
/**
 * Clase Localidad
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class Localidad
{ 
    private String nombre;
    private String provincia;
    /**
     * Constructor de la clase Localidad.
     */
    public Localidad(String p_nombre,String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    /** Setter Nombre.
     * @param p_nombre de tipo String.
     */
    public void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /** Setter Provincia.
     * @param p_provincia de tipo String. 
     */
    public void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    /** Getter Nombre.
     * @return nombre de tipo String.
     */
    public String getNombre(){
        return this.nombre; 
    }
    
    /** Getter Provincia.
     * @return provincia de tipo String.
     */
    public String getProvincia(){
        return this.provincia; 
    }
    
    /**
     * Metodo mostrar() de la clase Localidad.
     * Muestra por pantalla el nombre de la localidad y la provincia.
     */
    public void mostrar(){
        System.out.println("Localidad : "+this.getNombre()+"\t Provincia : "+this.getProvincia()); 
    }
}
