import java.util.*;

/**
 * Write a description of class UnidadDeRiesgo here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class UnidadDeRiesgo
{
    private String agricultor;
    private String cultivo;
    private Calendar fechaCosecha;
    
    public UnidadDeRiesgo(String p_agricultor, String p_cultivo, Calendar p_fechaCosecha){
        this.setAgricultor(p_agricultor);
        this.setCultivo(p_cultivo);
        this.setFechaCosecha(p_fechaCosecha);
    }
    
    private void setAgricultor(String p_agricultor){this.agricultor = p_agricultor;}
    private void setCultivo(String p_cultivo){this.cultivo = p_cultivo;}
    private void setFechaCosecha(Calendar p_fechaCosecha){this.fechaCosecha = p_fechaCosecha;}
    
    public String getAgricultor(){return this.agricultor;}
    public String getCultivo(){return this.cultivo;}
    public Calendar getFechaCosecha(){return this.fechaCosecha;}
    
    public void mostrarDetalle(){
        System.out.println("Agricultor: "+this.getAgricultor());
        System.out.println("Cultivo: "+this.getCultivo());
    }
}
