import java.util.*;

/**
 * La clase Empleado calcula la antigüedad de servicio del empleado y el sueldo neto que debe cobrar.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    //int anioIngreso;
    private Calendar fechaIngreso;
    
    /**
     * Constructor de la clase Empleado
     * @param p_cuil Define el CUIL del empleado.
     * @param p_apellido Define el apellido del empleado.
     * @param p_nombre Define el nombre del empleado.
     * @param p_importe Define el sueldo basico del empleado.
     * @param p_anio Define el año de ingreso del empleado.
     */
    public Empleado(long p_cuil, String p_apellido,String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    public Empleado(long p_cuil, String p_apellido,String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    
    
    private void setCuil(long p_cuil){
        this.cuil=p_cuil;
    }
    
    private void setApellido(String p_apellido){
        this.apellido=p_apellido;
    }
    
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico=p_importe;
    }
    
    private void setAnioIngreso(int p_anio){
        Calendar anioIngreso = Calendar.getInstance();
        anioIngreso.set(p_anio,1,1);
        this.setFechaIngreso(anioIngreso);
    }
    
    private void setFechaIngreso(Calendar p_fechaIngreso){
        this.fechaIngreso = p_fechaIngreso;
    }
    
    /**
     *Método donde se obtiene el CUIL del empleado.
     *@return Devuelve el CUIL del empleado.
     */
    public long getCuil(){
        return this.cuil;
    }
    
    /**
     *Método donde se obtiene el apellido del empleado.
     *@return Devuelve el apellido del empleado.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     *Método donde se obtiene el nombre del empleado.
     *@return Devuelve el nombre del empleado.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     *Método que obtiene el sueldo basico el empleado.
     *@return Devuelve el suldo basico el empleado.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /**
     *Método que obtiene el año que ingreso el empleado.
     *@return Devuelve el año que ingreso el empleado.
     */
    public int getAnioIngreso(){
        return this.getFechaIngreso().get(Calendar.YEAR);
    }
    
    /**
     * Metodo que obtiene la fecha que ingreso el empleado a la empresa.
     * return Devuelve la fecha que ingreso el empleado a la empresa.
     */
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    /**
     * El método calcula los años de antigüedad del empleado.
     * @return Devuelve los años de antigüedad del empleado.
     */
    public int antiguedad(){
        Calendar fechaActual = new GregorianCalendar();
        int anioActual = fechaActual.get(Calendar.YEAR);
        return (anioActual-this.getAnioIngreso());
    }
    
    /**
     * El método calcula sobre el sueldo basico del empleado, un descuento del 2%, más $12 del seguro de vida.
     * @return Devuelve el sueldo del cliente, con sus respectivos descuentos.
     */
    private double descuento(){
        int seguroVida=12;
        double obraSocial = (this.getSueldoBasico()*2)/100;
        
        return (this.getSueldoBasico()-seguroVida-obraSocial);
    }
    
    /**
     * El método evalua la antigüedad del empleado, y según la cantidad de años calcula el adicional.
     * @return Devuelve el pago adicional del empleado.
     */
    private double adicional(){
        if(this.antiguedad()<2){
            return this.getSueldoBasico()+(this.getSueldoBasico()*2)/100;
        }else if(this.antiguedad()>=10){
            return this.getSueldoBasico()+(this.getSueldoBasico()*6)/100;
        }else {
            return this.getSueldoBasico()+(this.getSueldoBasico()*4)/100;
        }
    }
    
    /**
     *El método suma el suelo basico más el adicional y resta el descuento.
     *@return Devuelve el sueldo neto del empleado.
     */
    public double sueldoNeto(){
        return this.getSueldoBasico()+this.adicional()-this.descuento();
    }
    
    /**
     * Método que concatena dos String, apellido y nombre del empleado.
     * @return Devuelve un String con el apellido y nombre del empleado.
     */
    public String apeYnom(){
        return this.getApellido()+" "+this.getNombre();
    }
    
    /**
     * Método que concatena dos String, nombre y apellido del empleado.
     * @return Devuelve un String con el nombre y apellido del empleado.
     */
    public String nomYape(){
       return this.getNombre()+" "+this.getApellido();
    }
    
    /**
     * El método muestra por pantalla nombre y apellido, cuil, años de servicio y sueldo neto del empleado.
     */
    public void mostrar(){
       System.out.println("Nombre y Apellido: "+ this.nomYape());
       System.out.println("CUIL: "+this.getCuil()+"  Antigüedad: "+this.antiguedad()+" años de servicio");
       System.out.println("Sueldo Neto: $"+this.sueldoNeto());
    }
    
    /**
     * El método muestra por pantalla en forma lineal el cuil, apellido y nombre, y sueldo neto del empleado.
     */
    public String mostrarLinea(){
       return this.getCuil()+"  "+this.apeYnom()+" ...... $"+this.sueldoNeto();
    }
    
    /**
     * Metodo esAniversario() de la clase Empleado.
     * @return true si cumple un año mas desde el dia que ingreso a la empresa.
     */ 
    public boolean esAniversario(){
        Calendar fechaActual = Calendar.getInstance();
        if(this.getFechaIngreso().get(Calendar.DATE) == fechaActual.get(Calendar.DATE) &&
            this.getFechaIngreso().get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH)+1){
                return true;
        }else{
                return false;
        }
    }
}