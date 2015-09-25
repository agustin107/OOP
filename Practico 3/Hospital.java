
/**
 * Clase Hospital
 * 
 * @author Agustin N. R. Ramirez 
 * @version Septiembre 2015
 */
public class Hospital
{ 
    private String nombreHospital;
    private String nombreDirector;
    /**
     * Constructor for objects of class Hospital
     */
    public Hospital(String p_nombreHospital,String p_nombreDirector)
    {
        this.setNombreDirector(p_nombreDirector);
        this.setNombreHospital(p_nombreHospital);
    }
    
    /** Getter NombreHospital.
     * @return nombreHospital de tipo String.
     */
    public String getNombreHospital(){
        return this.nombreHospital; 
    }
    
    /** Getter NombreDirector.
     * @return nombreDirector de tipo String
     */
    public String getNombreDirector(){
        return this.nombreDirector; 
    }
    
    /** Setter NombreDirector.
     * @param p_nombreDirector se asigna a nombreDirector.
     */
    public void setNombreDirector(String p_nombreDirector){
        this.nombreDirector=p_nombreDirector; 
    }
    
    /** Setter NombreHospital.
     * @param p_nombreHospital se asigna a nombreHospital.
     */
    public void setNombreHospital(String p_nombreHospital){
        this.nombreHospital = p_nombreHospital; 
    }
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getNombreHospital() + "   " + "Director: " + this.getNombreDirector());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Paciente: " + p_paciente.getNombre() + "  " +"Historia Clinica: " + p_paciente.getHistoria() + "   " + "Domicilio: " + p_paciente.getDomicilio());
        System.out.println("Localidad donde vive: " + p_paciente.getVive().getNombre() + "   " + "Provincia donde vive: " + p_paciente.getVive().getProvincia());
        System.out.println("Localidad donde nacio: " + p_paciente.getNacido().getNombre() + "   " + "Provincia donde nacio: " + p_paciente.getNacido().getProvincia());
    }
}


