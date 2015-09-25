import java.util.*;

/**
 * La clase Persona contiene cinco atributos (dni, nombre, apellido, año de nacimiento).
 * Puede calcular la edad de la persona con uno de sus metodos, tambien mostrar por pantalla los datos.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Persona
{
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private Calendar fechaNacimiento = Calendar.getInstance();
    
    /**
     *Constructor de la clase Persona.
     *@param p_dni define número de documento.  
     *@param p_nombre define nombre de la persona.
     *@param p_apellido define el apellido de la persona.
     *@param p_anio define el año de nacimiento de la persona.
     */
    public Persona(int p_dni,String p_nombre,String p_apellido,int p_anio){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    public Persona(int p_dni,String p_nombre,String p_apellido,Calendar p_fecha){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    
    private void setDNI(int p_dni){
        this.nroDni= p_dni;
    }
    
    /**
     * Método donde se obtiene el número de DNI de la persona.
     * @return Devuelve el número de DNI.
     */
    public int getDNI(){
        return this.nroDni;
    }
    
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    
    /**
     * Método donde se obtiene el nombre de la persona.
     * @return Devuelve el nombre.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido=p_apellido;
    }
    
    /**
     * Método donde se obtiene el apellido de la persona.
     * @return Devuelve el apellido.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    private void setAnioNacimiento(int p_anioNacimiento){
         this.anioNacimiento=p_anioNacimiento;
    }
    
    /**
     * Método donde se obtiene Año de nacimiento de la persona.
     * @return Devuelve el año de nacimiento.
     */
    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }
    
    private void setFechaNacimiento(Calendar p_fechaNacimiento){
        this.fechaNacimiento=p_fechaNacimiento;
    }
    
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    /**
     * Método que calcula la edad de la persona.
     * @return Devuelve la edad de la persona.
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int calculoEdad=(anioHoy-this.getAnioNacimiento());
        return calculoEdad;
    }
    
    /**
     * Método que concatena dos String, nombre y apellido de la persona.
     * @return Devuelve un String con el nombre y apellido de la persona.
     */
    public String nomYApe(){
        return (this.getNombre()+" "+this.getApellido());
    }
    
     /**
     * Método que concatena dos String, apellido y nombre de la persona.
     * @return Devuelve un String con el apellido y nombre de la persona.
     */
    public String apeYNom(){
        return (this.getApellido()+" "+this.getNombre());
    }
    
    /**
     * Método que muestra por pantalla nombre y apellido, DNI y edad de la persona.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+this.nomYApe());
        System.out.println("DNI: "+this.getDNI()+"   Edad:"+this.edad());
    }
    
    /**
      * Metodo esCumpleanios(), calcula  si es el cumpleaños, teniendo en cuenta el dia, fecha y año de nacimiento;
      * @return true o false segun corresponda.
      */
    public boolean esCumpleanios(){
        Calendar fechaHoy = Calendar.getInstance();
        
        if ((fechaHoy.get(Calendar.DATE)==this.getFechaNacimiento().get(Calendar.DATE)) &&
            (fechaHoy.get(Calendar.MONTH)+1==this.getFechaNacimiento().get(Calendar.MONTH))){
                return true;
            }else{ 
                return false;}
    }
}