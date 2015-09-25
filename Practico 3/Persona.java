import java.util.*;
/**
 * Clase Persona
 * 
 * @author Agustin N. R. Ramirez
 * @version Agosto 2015
 */
public class Persona
{ 
    private int nroDni;
    private String nombre;
    private String apellido;
    // private int anioNacimiento;
    private Calendar fechaNacimiento;
    
    public Persona (int p_nroDni, String p_nombre, String p_apellido, int p_anioNacimiento){
        this.setNroDni(p_nroDni);
        this.setNombre (p_nombre);
        this.setApellido (p_apellido);
        this.setAnioNacimiento(p_anioNacimiento);
        this.fechaNacimiento.getInstance();
    }
    public Persona(int p_dni,String p_nombre,String p_apellido,Calendar p_fecha){
        this.setNroDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    /** Setter FechaNacimiento.
    * @param p_fecha se asigna a fechaNacimiento.
    */    
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento=p_fecha;
    }
    /** Getter FechaNacimiento.
    * @retur fechaNacimiento de tipo Calendar.
    */
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    /** Metodo para obtener el valor del atributo nro de Dni
    * 
    * @return el valor del atributo nroDni que es de tipo entero
    */
    public int getNroDni (){
        return this.nroDni;
    }
    /** Metodo para modificar el valor del atributo nro de dni asignadole la variable nroDni
    * 
    * @param se le pasa como parametro el valor que se encuentra en la variable nroDni
    */
    private void setNroDni (int p_nroDni){
        this.nroDni = p_nroDni;
    }
    private void setNombre (String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
    public String getApellido (){
        return this.apellido;
    }
    private void setApellido (String p_apellido){
        this.apellido = p_apellido;
    }
    public int getAnioNacimiento(){
        int anioNacimiento = this.getFechaNacimiento().get(Calendar.YEAR);
        return anioNacimiento;
    }
    private void setAnioNacimiento (int p_anioNacimiento){
        Calendar anio = new GregorianCalendar();
        anio.set(p_anioNacimiento,0,1);
        this.fechaNacimiento= anio;
    }
    
    /** Metodo para calcular la edad del objeto persona que se va a instanciar
    * 
    * @return retorna la variable de tipo entero edad que contiene la cantidad de años de la persona
    */
    public int edad (){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int edad = (anioHoy - this.getAnioNacimiento());
        return edad;
    
    }
    /** Metodo que imprime una leyenda con el Nombre y Apellido de la persona objeto
    * 
    * @return un cadena de caracteres con el nombre y apellido de la persona
    */
    public String nomYApe (){
        return this.getNombre() + " " +  this.getApellido();
    }
    public String apeYNom (){
        return this.getApellido() + " " + this.getNombre();
    }
    public void mostrar () {
        System.out.println("Nombre y Apellido: "+ this.nomYApe());
        System.out.println("DNI: " + this.getNroDni() + "Edad: " + this.edad() + "años");
    }
    
    public boolean esCumpleaños(){
        Calendar fechaActual=Calendar.getInstance();
        if( (fechaActual.get(Calendar.DATE)== this.getFechaNacimiento().get(Calendar.DATE))&&
        (fechaActual.get(Calendar.MONTH)+1 == this.getFechaNacimiento().get(Calendar.MONTH)))
        {
        return true;}
        else
        {return false;}
    }
}
        

