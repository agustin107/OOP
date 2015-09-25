import java.util.*;
/**
 * Write a description of class Fecha here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(){
        Calendar fechaHoy = Calendar.getInstance();
        this.setDia(fechaHoy.get(Calendar.DATE));
        this.setMes(fechaHoy.get(Calendar.MONTH)+1);
        this.setAnio(fechaHoy.get(Calendar.YEAR));
    }
    
    public Fecha(int p_dia, int p_mes, int p_anio){
        this.setDia(p_dia);
        this.setMes(p_mes);
        this.setAnio(p_anio);
    }
    
    public Fecha(Calendar p_fecha){
        this.setDia(p_fecha.get(Calendar.DATE));
        this.setMes(p_fecha.get(Calendar.MONTH)+1);
        this.setAnio(p_fecha.get(Calendar.YEAR));
    }
    
    public Fecha(Fecha p_fecha){
        this.setDia(p_fecha.getDia());
        this.setMes(p_fecha.getMes());
        this.setAnio(p_fecha.getAnio());
    }
    
    private void setDia(int p_dia){this.dia = p_dia;}
    private void setMes(int p_mes){this.mes = p_mes;}
    private void setAnio(int p_anio){this.anio = p_anio;}
    
    public int getDia(){return this.dia;}
    public int getMes(){return this.mes;}
    public int getAnio(){return this.anio;}
    
    public Fecha incrementarFecha(int p_incrementar){
       Calendar fecha = Calendar.getInstance();
       fecha.set(this.getAnio(),this.getMes()-1,this.getDia());
       fecha.add(Calendar.DATE,  p_incrementar);
       return this;
    }
    
    public Fecha incrementarSinCambio(int p_dias){
        Calendar fechaModificada = new GregorianCalendar();
        fechaModificada.set(this.getAnio(),this.getMes()-1,this.getDia());
        fechaModificada.add(Calendar.DATE , p_dias);
        Fecha fecha = new Fecha(fechaModificada);
        return fecha;
    }
        
    public String nombreMes(){
        switch(this.getMes()){
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo"; 
            case 4: return "Abril";
            case 5: return "Mayo"; 
            case 6: return "Junio"; 
            case 7: return "Julio"; 
            case 8: return "Agosto"; 
            case 9: return "Septiembre"; 
            case 10: return  "Octubre"; 
            case 11: return "Noviembre";
            default: return "Diciembre"; 
            
        }
    }
    
    public String verNumero(){
        return this.getDia()+"/"+this.getMes()+"/"+this.getAnio();
    }
    
    public String verLetra(){
        return this.getDia()+" de "+ this.nombreMes() +" de "+ this.getAnio();
    }
    
    /**
     * Metodo que se encarga de calcular la cantidad de dias que hay de una fecha a otra.
     * @param p_fecha del tipo Fecha
     * @return devuelve un valor del tipo integer
     */
    public int diasCorridos(Fecha p_fecha){
        
        Calendar fecha1 = Calendar.getInstance();
        Calendar fecha2 = Calendar.getInstance();
        
        fecha1.set(this.getAnio(), this.getMes(), this.getDia());
        fecha2.set(p_fecha.getAnio(),p_fecha.getMes(),p_fecha.getDia());
        
        long milisegundos1 = fecha1.getTimeInMillis();
        long milisegundos2 = fecha2.getTimeInMillis();
        long milisegundos3 = fecha1.getTimeInMillis() - fecha2.getTimeInMillis();
        
        return (int) (milisegundos3/1000/60/60/24);//se realiza un CAST
    }
}

