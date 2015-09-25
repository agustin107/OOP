
/**
 * Write a description of class Mujer here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class Mujer
{ 
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    public Mujer (String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }
    public Mujer (String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casada"); 
        this.setEsposo(p_esposo);
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }  
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;  
    }
    public String getNombre (){
        return this.nombre;
    }
    public String getApellido (){
        return this.apellido;
    }
    public int getEdad (){
        return this.edad;
    }
    public String getEstadoCivil (){
        return this.estadoCivil;
    }  
    public Hombre getEsposo(){
        return this.esposo;
    }
    public void casarseCon (Hombre p_esposo){
        setEstadoCivil("Casada");
        setEsposo(p_esposo);
    }
    public void divorcio(){
        this.setEsposo(null);  
    }
    public String datos(){
        return (this.getNombre()+ "   " + this.getApellido()+ " de  " + this.getEdad() + "  " + "años");
    }
    public void mostrarEstadoCivil(){
        System.out.println(this.getNombre() + "  " + this.getApellido() + " de  " + this.getEdad() + " . " + this.getEstadoCivil());  
    }
    public void casadaCon(){
        System.out.println(this.getNombre() + "  " + this.getApellido() + "  de  " + this.getEdad() + "  " + "casada con" + "  " + this.getEsposo().datos());
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
