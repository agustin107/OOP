
/**
 * Clase Hospital
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Hospital
{
    // atributos
    private String nombreHospital;
    private String nombreDirector;

    /**
     * Constructor de la clase
     */
    public Hospital()
    {
        
    }

    /**
     * 
     */
    public String getNombreHospital() {
        return this.nombreHospital;
    }
    
    /**
     * 
     */
    private void setNombreHospital(String p_nombreHospital) {
        this.nombreHospital = p_nombreHospital;
    }
    
    /**
     * 
     */
    public String getNombreDirector() {
        return this.nombreDirector;
    }
    
    /**
     * 
     */
    private void setNombreDirector(String p_nombreDirector) {
        this.nombreDirector = p_nombreDirector;
    }
    
    /**
     * 
     */
    public void consultaDatosFiliatorios(Paciente p_paciente) {
        
    }
}
