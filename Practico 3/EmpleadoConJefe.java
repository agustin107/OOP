
/**
 * Clase EmpleadoConJefe
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class EmpleadoConJefe
{
    // atributos
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    /**
     * Constructor de la clase
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fechaIngreso, EmpleadoConJefe p_jefe)
    {
        // inicializo atributos
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fechaIngreso);
        this.setJefe(p_jefe);
    }

    /**
     * Constructor de la clase
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        // inicializo atributos
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    
    /**
     * Constructor de la clase
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        // inicializo atributos
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_anio);
    }
    
    /**
     * 
     */
    public long getCuil() {
        return this.cuil;
    }
    
    /**
     * 
     */
    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
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
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    
    /**
     * 
     */
    private void setSueldoBasico(double p_importe) {
        this.sueldoBasico = p_importe;
    }
    
    /**
     * 
     */
    public int getAnioIngreso() {
        
    }
    
    /**
     * 
     */
    private void setAnioIngreso(int p_anio) {
        
    }
    
    /**
     * 
     */
    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    /**
     * 
     */
    private void setFechaIngreso(Calendar p_fechaIngreso) {
        this.fechaIngreso = p_fechaIngreso;
    }
    
    /**
     * 
     */
    public EmpleadoConJefe getJefe() {
        return this.jefe;
    }
    
    /**
     * 
     */
    private void setJefe(EmpleadoConJefe p_jefe) {
        this.jefe = p_jefe;
    }
    
    /**
     * 
     */
    public int antiguedad() {
        
    }
    
    /**
     * 
     */
    private double descuento() {
        
    }
    
    /**
     * 
     */
    private double adicional() {
        
    }
    
    /**
     * 
     */
    public double sueldoNeto() {
        
    }
    
    /**
     * 
     */
    public String nomYape() {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * 
     */
    public String apeYnom() {
        return this.getApellido() + ", " + this.getNombre();
    }
    
    /**
     * 
     */
    public void mostrarPantalla() {
        System.out.println("Nombre y Apellido: " + this.nomYape());
        System.out.println("CUIL: " + this.getCuil() + " Antiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $ " + this.sueldoNeto());
        System.out.prin("Responde a: ");
        if(this.getJefe() != null) {
            System.out.print(this.getJefe().apeYnom());
        } else {
            System.out.print("GERENTE GENERAL"); 
        }
    }
    
    /**
     * 
     */
    public String mostrarLinea() {
        String mostrar;
        
        mostrar = this.getCuil() + "\t " + this.apeYNom() + "\t .............. $" + this.sueldoNeto();
        return mostrar;
    }
}
