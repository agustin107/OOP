
/**
 * Write a description of class Docente here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class Docente
{ 
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacionFamiliar(p_asignacionFamiliar);
    }
    
    /** Setter Nombre.
    * @param p_nombre se asigna a nombre.
    */
    public void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    
    /** Setter Grado.
    * @param p_grado se asigna a grado.
    */
    public void setGrado(String p_grado){
        this.grado=p_grado;
    }
    
    /** Setter SueldoBasico.
    * @param p_sueldoBasico se asigna a sueldoBasico.
    */
    public void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico=p_sueldoBasico;
    }
    
    /** Setter AsignacionFamiliar.
    * @param p_asignacionFamiliar se asigna a asignacionFamiliar.
    */
    public void setAsignacionFamiliar(double p_asignacionFamiliar){
        this.asignacionFamiliar=p_asignacionFamiliar;
    }
    
    /** Getter Nombre.
    * @return nombre de tipo String.
    */
    public String getNombre(){
        return this.nombre;
    }
    
    /** Getter Grado.
    * @return grado de tipo String.
    */
    public String getGrado(){
        return this.grado;
    }
    
    /** Getter SueldoBasico.
    * @return sueldoBasico de tipo double.
    */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /** Getter AsignacionFamiliar.
    * @return asignacionFamiliar de tipo double.
    */
    public double getAsignacionFamiliar(){
        return this.asignacionFamiliar;
    }
    public double calcularSueldo(){
        double sueldo = (this.getSueldoBasico() + this.getAsignacionFamiliar());
        return sueldo;
    }
}

