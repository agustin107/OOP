import java.util.*;
/**
 * Write a description of class Siniestro here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Siniestro
{
   private Calendar fecha;
   private double porcentajeDanio;
   
   public Siniestro(Calendar p_fecha, double p_porcentajeDanio){
       this.setFecha(p_fecha);
       this.setPorcentajeDanio(p_porcentajeDanio);
   }
   
   private void setFecha(Calendar p_fecha){this.fecha = p_fecha;}
   private void setPorcentajeDanio(double p_porcenajeDanio){this.porcentajeDanio = porcentajeDanio;}
   
   public Calendar getFecha(){return this.fecha;}
   public double getPorcentajeDanio(){return this.porcentajeDanio;}
   
   public double totalDanio(double p_valorAsegurado){
       return ((this.getPorcentajeDanio()*p_valorAsegurado)/100);
   }
}
