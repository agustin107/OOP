
/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CajaDeAhorro
{
    // atributos
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;

    /**
     * Constructor de la clase
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular)
    {
        // inicializo atributos
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }
    
    /**
     * Constructor de la clase
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }
    
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }
    
    public Persona getTitular() {
        return this.titular;
    }
    
    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }
    
    public int getExtraccionesPosibles() {
        return this.extraccionesPosibles;
    }
    
    private void setExtraccionesPosibles(int p_extracciones) {
        this.extraccionesPosibles = p_extracciones;
    }
    
    private boolean puedeExtraer(double p_importe) {
        
    }
    
    private void extraccion(double p_importe) {
        
    }
    
    public void extraer(double p_importe) {
        
    }
    
    public void depositar(double p_importe) {
        
    }
    
    public void mostrar() {
        
    }
}
