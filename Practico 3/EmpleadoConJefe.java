import java.util.*;
/**
 * Clase EmpleadoConJefe
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class EmpleadoConJefe
{ 
  private long cuil; 
  private String apellido;
  private String nombre;
  private double sueldoBasico;
  private Calendar fechaIngreso = Calendar.getInstance();
  private EmpleadoConJefe jefe;
  
  public EmpleadoConJefe (long p_cuil, String p_apellido, String p_nombre, double p_importe,Calendar p_fecha, EmpleadoConJefe p_jefe){
    this.setCuil(p_cuil);
    this.setApellido(p_apellido);
    this.setNombre(p_nombre);
    this.setImporte(p_importe);
    this.setFechaIngreso(p_fecha);
    this.setJefe(p_jefe);
    
    }
  public EmpleadoConJefe (long p_cuil, String p_apellido, String p_nombre, double p_importe,Calendar p_fecha){
    this.setCuil(p_cuil);
    this.setApellido(p_apellido);
    this.setNombre(p_nombre);
    this.setImporte(p_importe);
    this.setFechaIngreso(p_fecha);   
    this.setJefe(null);
}
 public EmpleadoConJefe (long p_cuil, String p_apellido, String p_nombre, double p_importe,int p_anio){
    this.setCuil(p_cuil);
    this.setApellido(p_apellido);
    this.setNombre(p_nombre);
    this.setImporte(p_importe);
    this.setAnioIngreso(p_anio);   
}
    /**
 * Metodo para calcular la cantidad de años que lleva una persona en el trabajo
 * 
 * 
 * @return el valor de tipo entero contenido en la variable antiguedad
 */
    public int antiguedad (){
     Calendar fechaHoy = new GregorianCalendar();
     return (fechaHoy.get(Calendar.YEAR) - this.getFechaIngreso().get(Calendar.YEAR));
}
/**
 * Metodo que asigna a una variable de tipo double llamada descuento el resultado de calcular el 2% del importe invoncando al metodo getimporte, mas la suma de 12 pesos
  del seguro de vida
 * 
 * @return retorna el valor contenido en la variable descuento de tipo double
 */   
private double descuento (){
    double descuento = ((getImporte()* 2/ 100) + 12);
    return descuento;
}
/**
 * Metodo que calcula cual es el adicional que le corresponde a un empleado segun su antiguedad en el trabajo
 * 
 * 
 * @return contenido de la variable adicional de tipo double
 */  
 private double adicional(){
       double adicional = 0;
       if (this.antiguedad() < 2){
        adicional = (getImporte()* 2 / 100);
        }
       else if ((this.antiguedad() >= 2) && (this.antiguedad() < 10)) {
        adicional = (getImporte()* 4 / 100);
    }
       else {
        adicional = (getImporte()* 6 / 100);
    }
        return adicional;
    }
 public double sueldoNeto(){
    double sueldoNeto = (this.getImporte() + this.adicional()) - this.descuento();
   return sueldoNeto;
}
public String nomYApe (){
return this.getNombre() + " " +  this.getApellido();
}
public String apeYNom (){
return this.getApellido() + " " + this.getNombre();
}
public long getCuil(){
    return this.cuil;
}
public String getApellido(){
    return this.apellido;
}
    public String getNombre(){
    return this.nombre;
}
    public double getImporte(){
    return this.sueldoBasico;
}
    public int getAnioIngreso(){
    return (this.getFechaIngreso().get(Calendar.YEAR));
}
public Calendar getFechaIngreso(){
 return this.fechaIngreso;
}
public EmpleadoConJefe getJefe(){
return this.jefe;
}
private void setCuil(long p_cuil){
    this.cuil = p_cuil;
}
private void setApellido(String p_apellido){
    this.apellido = p_apellido;
}
private void setNombre(String p_nombre){
    this.nombre = p_nombre;
}
private void setImporte(double p_importe){
    this.sueldoBasico = p_importe;
}
private void setAnioIngreso(int p_anio){
    Calendar anio = new GregorianCalendar ();
    anio.set(p_anio, 9, 12);
    this.setFechaIngreso(anio);
}
private void setFechaIngreso(Calendar p_fecha){
   this.fechaIngreso = p_fecha;
}
private void setJefe(EmpleadoConJefe p_jefe){
   this.jefe = p_jefe;
}
public void mostrarPantalla(){
    if(this.getJefe() == null){
    System.out.println("Nombre y Apellido: " + this.nomYApe());
    System.out.println("CUIL: " + this.getCuil() + "    " + "Antiguedad: " + this.antiguedad() + "  " + "años de servicio");
    System.out.println("Sueldo Neto: " + this.sueldoNeto());
    System.out.println("GERENTE GENERAL");
}
    else {
    System.out.println("Nombre y Apellido: " + this.nomYApe());
    System.out.println("CUIL: " + this.getCuil() + "    " + "Antiguedad: " + this.antiguedad() + "  " + "años de servicio");
    System.out.println("Sueldo Neto: " + this.sueldoNeto());
    System.out.println("Responde a: " + this.getJefe().nomYApe());
}
}
public void mostrarLinea(){
    System.out.println(this.getCuil() + this.apeYNom() + "............" + this.sueldoNeto());
}
 
public boolean esAniversario(){
  Calendar fecha = new GregorianCalendar();
    if (fecha.get(Calendar.DATE) == (this.getFechaIngreso().get(Calendar.DATE))
        && (fecha.get(Calendar.MONTH)+1) == (this.getFechaIngreso().get(Calendar.MONTH))){
              return true;
          }
       else{
              return false;
            }
   }   
}