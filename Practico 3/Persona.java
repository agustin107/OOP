import java.util.*;

/**
 * Clase Persona
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0.0
 */
public class Persona
{
    // variables de instancia
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private Calendar fechaNacimiento;

    /**
     * Constructor de la clase
     * 
     * @param   dni, nombre, apellido, año de nacimiento
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        // inicializo atributos
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    /**
     * Constructor de la clase
     * 
     * @param   dni, nombre, apellido, fechaDeNacimiento
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fechaNacimiento) {
        // inicializo atributos
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fechaNacimiento);
    }
    
    /**
     * Devuelve el DNI
     * 
     * @return      DNI
     */
    public int getDNI() {
        return this.nroDni;
    }
    
    /**
     * Establece el DNI
     * 
     * @param   DNI
     */
    private void setDNI(int p_dni) {
        // put your code here
        this.nroDni = p_dni;
    }
    
    /**
     * Devuelve el nombre
     * 
     * @return      nombre
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Establece el estado actual de nombre
     * 
     * @param      nombre
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Devuelve el apellido
     * 
     * @return      apellido
     */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
     * Establece el apellido
     * 
     * @param      apellido
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    
    /**
     * Devuelve el año de nacimiento
     * 
     * @return      año de nacimiento
     */
    public int getAnioNacimiento() {
        return this.anioNacimiento;
    }
    
    /**
     * Establece el año de nacimiento
     * 
     * @param      año de nacimiento
     */
    private void setAnioNacimiento(int p_anio) {
        this.anioNacimiento = p_anio;
    }
    
    /**
     * Devuelve la fecha de nacimiento
     * 
     * @return      fecha de nacimiento
     */
    public Calendar getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    /**
     * Establece la fecha de nacimiento
     * 
     * @param      fecha de nacimiento
     */
    private void setFechaNacimiento(Calendar p_fechaNacimiento) {
        this.fechaNacimiento = p_fechaNacimiento;
    }
    
    /**
     * Devuelve la edad
     * 
     * @return      edad
     */
    public int edad() {
        //Obtengo la fecha actual en calendario Gregoriano
        Calendar fechaHoy = new GregorianCalendar();
        //Obtengo el año de la fecha actual
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        //Devuelvo la edad, calculando el año actual menos el año de nacimiento
        return anioHoy - this.anioNacimiento;
    }
    
    /**
     * Devuelve el nombre y apellido
     * 
     * @return      nombre y apellido
     */
    public String nomYApe() {
        return this.nombre + " " + this.apellido;
    }
    
    /**
     * Devuelve el apellido y nombre
     * 
     * @return      apellido y nombre
     */
    public String apeYNom() {
        return this.apellido + " " + this.nombre;
    }
    
    /**
     * Muestra por pantalla el nombre y apellido,
     * el DNI y la edad
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.nroDni + "\t Edad: " + this.edad());
    }
    
    /**
     * 
     */
    public boolean esCumpleaños() {
        
    }
}