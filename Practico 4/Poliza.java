import java.util.*;
/**
 * Write a description of class Poliza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poliza
{
    private String cobertura;
    private Calendar fechaContrato;
    private double valorPoliza;
    private double valorAsegurado;
    private String momentoCancelacion;
    private UnidadDeRiesgo unidad;
    private Siniestro siniestro;
    
    //Constructor de poliza sin siniestro.
    public Poliza(String p_cobertura, Calendar p_fechaContrato, double p_valorPoliza, double p_valorAsegurado, String p_momentoCancelacion, UnidadDeRiesgo p_unidad){
        this.setCobertura(p_cobertura);
        this.setFechaContrato(p_fechaContrato);
        this.setValorPoliza(p_valorPoliza);
        this.setValorAsegurado(p_valorAsegurado);
        this.setMomentoCancelacion(p_momentoCancelacion);
        this.setUnidadRiesgo(p_unidad);
        this.setSiniestro(null);
    }
    
    //Constructor de poliza con siniestro.
    public Poliza(String p_cobertura, Calendar p_fechaContrato, double p_valorPoliza, double p_valorAsegurado, String p_momentoCancelacion, UnidadDeRiesgo p_unidad, Siniestro p_siniestro){
        this.setCobertura(p_cobertura);
        this.setFechaContrato(p_fechaContrato);
        this.setValorPoliza(p_valorPoliza);
        this.setValorAsegurado(p_valorAsegurado);
        this.setMomentoCancelacion(p_momentoCancelacion);
        this.setUnidadRiesgo(p_unidad);
        this.setSiniestro(p_siniestro);
    }
    
    private void setCobertura(String p_cobertura){this.cobertura = p_cobertura;}
    private void setFechaContrato(Calendar p_fechaContrato){this.fechaContrato = p_fechaContrato;}
    private void setValorPoliza(double p_valorPoliza){this.valorPoliza = p_valorPoliza;}
    private void setValorAsegurado(double p_valorAsegurado){this.valorAsegurado = p_valorAsegurado;}
    private void setMomentoCancelacion(String p_momentoCancelacion){this.momentoCancelacion = p_momentoCancelacion;}
    private void setUnidadRiesgo(UnidadDeRiesgo p_unidad){this.unidad=p_unidad;}
    private void setSiniestro(Siniestro p_siniestro){this.siniestro = p_siniestro;}
    
    public String getCobertura(){return this.cobertura;}
    public Calendar getFechaContrato(){return this.fechaContrato;}
    public double getValorPoliza(){return this.valorPoliza;}
    public double getValorAsegurado(){return this.valorAsegurado;}
    public String getMomentoCancelacion(){return this.momentoCancelacion;}
    public UnidadDeRiesgo getUnidadRiesgo(){return this.unidad;}
    public Siniestro getSiniestro(){return this.siniestro;}
    
    public double indemnizacion(){
        if(this.getCobertura() == "incendio"){
            return ((this.getSiniestro().totalDanio(this.getValorAsegurado())*75)/100);
        }else
        if(this.getCobertura()== "resiembra"){
            return ((this.getSiniestro().totalDanio(this.getValorAsegurado())*30)/100);
        }else{
            return this.getSiniestro().totalDanio(this.getValorAsegurado());
        }
    }
    
    public Calendar fechaIndemnizacion(){
        if(this.getCobertura() == "incendio"){
            this.getSiniestro().getFecha().add(Calendar.DATE,20);
            return this.getSiniestro().getFecha();
        }else{
            return this.getUnidadRiesgo().getFechaCosecha();
        }
    }
    
    public void detallesPrecioPoliza(){
        if(this.getMomentoCancelacion()==("inicial")){
            this.setValorPoliza(this.getValorPoliza()-((this.getValorPoliza()*25)/100));
            System.out.println("El abono se realiza al comiento de la siembra. Sufre un descuento del 25%. Precio Real Abonado: $"+this.getValorPoliza());
        }else{
            System.out.println("El abono se realiza al finalizar la siembra. Se abona el 100% de la poliza.");
        }
    }
    
    public void resumenIndemnizacion(){
        System.out.println("******* RESUMEN DEL SEGURO CONTRATADO EL DIA "+
                            this.getFechaContrato().get(Calendar.DATE)+"/"+
                            this.getFechaContrato().get(Calendar.MONTH)+"/"+
                            this.getFechaContrato().get(Calendar.YEAR)+" ******");
        System.out.println("--------- Detalles de forma de pago de la poliza -------");
        System.out.println("Precio a pagar: "+this.getValorPoliza());
        this.detallesPrecioPoliza();
        System.out.println("Valor de cultivo asegurado: $" + this.indemnizacion());
        System.out.println("--------- Detalles de la unidad de riesgo -------------");
        this.getUnidadRiesgo().mostrarDetalle();
        System.out.println("****************************************************"); 
    }
}
