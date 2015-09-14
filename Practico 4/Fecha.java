// Importo librerias
import java.util.Calendar;

/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    // variables de instancia
    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor de objetos de la clase Fecha
     */
    public Fecha()
    {
        // inicializo variables de instancia
        this.setDia(1);
        this.setMes(1);
        this.setAnio(1);
    }
    
    public Fecha(int p_dia, int p_mes, int p_anio) {
        this.setDia(p_dia);
        this.setMes(p_mes);
        this.setAnio(p_anio);
    }
    
    public Fecha(Calendar p_fecha) {
        this.setDia(p_fecha.DATE);
        this.setMes(p_fecha.MONTH + 1);
        this.setAnio(p_fecha.YEAR);
    }
    
    public Fecha(Fecha p_fecha) {
        this.setDia(p_fecha.getDia());
        this.setMes(p_fecha.getMes());
        this.setAnio(p_fecha.getAnio());
    }
    
    public int getDia() {
        return this.dia;
    }
    
    private void setDia(int p_dia) {
        this.dia = p_dia;
    }
    
    public int getMes() {
        return this.mes;
    }
    
    private void setMes(int p_mes) {
        this.mes = p_mes;
    }
    
    public int getAnio() {
        return this.anio;
    }
    
    private void setAnio(int p_anio) {
        this.anio = p_anio;
    }
    
    public Fecha incrementarFecha(int p_incremento) {
        this.setDia(this.getDia() + p_incremento);
    }
    
    public String verNumero() {
        String numero;
        
        numero = this.getDia() + "/" + this.getMes() + "/" + this.getAnio();
        return numero;
    }
    
    public String verLetra() {
        
    }
    
    public String nombreMes() {
        
    }
    
    public Fecha incrementarSinCambio(int dias) {
        
    }
    
    public int diasCorridos(Fecha p_fecha) {
        
    }
}
