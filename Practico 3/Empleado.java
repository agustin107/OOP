// Paquetes necesarios para la clase
import java.util.*;

/**
 * Clase Empleado
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Empleado
{
    // atributos
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;

    /**
     * Constructor de la clase
     * 
     * @param   cuil, apellido, nombre, importe, año de ingreso
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        // initialise instance variables
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    /**
     * Constructor de la clase
     * 
     * @param   cuil, nombre, apellido, importe, fecha de ingreso
     */
    public Empleado(long p_cuil, String p_nombre, String p_apellido, double p_importe, Calendar p_fechaIngreso) {
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        thsi.setFechaIngreso(p_fechaIngreso);
    }
    
    /**
     * Devuelve el cuil
     * 
     * @return  cuil
     */
    public long getCuil() {
        return this.cuil;
    }
    
    /**
     * Establece el cuil
     * 
     * @param   cuil
     */
    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }
    
    /**
     * Devuelve el apellido
     * 
     * @return  apellido
     */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
     * Establece el apellido
     * 
     * @param   apellido
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
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
     * Devuelve el sueldo basico
     * 
     * @return sueldo basico
     */
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    
    /**
     * Establece el sueldo basico
     * 
     * @param   sueldo basico
     */
    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }
    
    /**
     * Devuelve el año de ingreso
     * 
     * @return año de ingreso
     */
    public int getAnioIngreso() {
        return this.anioIngreso;
    }
    
    /**
     * Establece el año de ingreso
     * 
     * @param   año de ingreso
     */
    private void setAnioIngreso(int p_anio) {
        this.anioIngreso = p_anio;
    }
    
    /**
     * Devuelve la fecha de ingreso
     * 
     * @return fecha de ingreso
     */
    public int getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    /**
     * Establece la fecha de ingreso
     * 
     * @param   fecha de ingreso
     */
    private void setFechaIngreso(Calendar p_fechaIngreso) {
        this.fechaIngreso = p_fechaIngreso;
    }
    
    /**
     * Devuelve la antiguedad
     * 
     * @return  antiguedad
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int antiguedad = anioHoy - this.getAnioIngreso();
        return antiguedad;
    }
    
    /**
     * Calcula y devuelve el descuento
     * 
     * @return  descuento
     */
    private double descuento() {
        int seguroDeVida = 12;
        double descuento = (2 * this.getSueldoBasico()) / 100;
        return descuento + seguroDeVida;
    }
    
    /**
     * Calcula y devuelve el adicional
     *  
     * @return  adicional
     */
    private double adicional() {
        double adicional;
        if(this.antiguedad() < 2) {
            adicional = (2 * this.getSueldoBasico()) / 100;
        } else if(this.antiguedad() >= 2 && this.antiguedad() < 10) {
                adicional = (4 * this.getSueldoBasico()) / 100;
        } else {
            adicional = (6 * this.getSueldoBasico()) / 100;
        }
        
        return adicional;
    }
    
    /**
     * Calcula y devuelve el sueldo neto
     * 
     * @return  sueldo neto
     */
    public double sueldoNeto() {
        double sueldoNeto;
        
        sueldoNeto = (this.sueldoBasico + this.adicional()) - this.descuento();
        return sueldoNeto;
    }
    
    /**
     * Devuelve el nombre y apellido
     * 
     * @return  nombre y apellido
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Devuelve el apellido y nombre
     * 
     * @return  nombre y apellido
     */
    public String apeYNom() {
        return this.getApellido() + ", " + this.getNombre();
    }
    
    /**
     * Muestra por pantalla el nombre y apellido, CUIL, antiguedad
     * y sueldo neto
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + " Antiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }
    
    /**
     * Devuelve el cuil, apellido y nombre y sueldo neto en una linea
     * 
     * @return cuil, apellido y nombre y sueldo neto
     */
    public String mostrarLinea() {
        String mostrar;
        
        mostrar = this.getCuil() + "\t " + this.apeYNom() + "\t .............. $" + this.sueldoNeto();
        return mostrar;
    }
}