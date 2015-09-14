
/**
 * Clase CuentaCorriente
 * 
 * @author Agustin N. R. Ramirez 
 * @version 1.0
 */
public class CuentaCorriente
{
    // atributos
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;

    /**
     * Constructor de la clase
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular)
    {
        // inicializo atributos
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }

    /**
     *  Constructor de la clase
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        // inicializo atributos
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    /**
     * 
     */
    public int getNroCuenta() {
        return this.nroCuenta;
    }
    
    /**
     * 
     */
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * 
     */
    public double getSaldo() {
        return this.saldo;
    }
    
    /**
     * 
     */
    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }
    
    /**
     * 
     */
    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }
    
    /**
     * 
     */
    private void setLimiteDescubierto(double p_limite) {
        this.limiteDescubierto = p_limite;
    }
    
    /**
     * 
     */
    private boolean puedeExtraer(double p_importe) {
        
    }
    
    /**
     * 
     */
    private void extraccion(double p_importe) {
        
    }
    
    /**
     * 
     */
    public void extraer(double p_importe) {
        
    }
    
    /**
     * 
     */
    public void depositar(double p_importe) {
        
    }
    
    /**
     * 
     */
    public void mostrar() {
        
    }
}
