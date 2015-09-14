
/**
 * Clase CuentaBancaria
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class CuentaBancaria
{
    // atributos
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    /**
     * Constructor de la clase
     * 
     * @param   nro de cuenta y titular
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular)
    {
        // inicializo los atributos
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }

    /**
     * Constructor de la clase
     * 
     * @param   nro de cuenta, titular y saldo
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    /**
     * Devuelve el numero de cuenta
     * 
     * @return  numero de cuenta
     */
    public int getNroCuenta() {
        return this.nroCuenta;
    }
    
    /**
     * Establece el numero de cuenta
     * 
     * @param   numero de cuenta
     */
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Devuelve el saldo
     * 
     * @return  saldo
     */
    public double getSaldo() {
        return this.saldo;
    }
    
    /**
     * Establece el saldo
     * 
     * @param   saldo
     */
    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }
    
    /**
     * Devuelve el titular
     * 
     * @return  titular
     */
    public Persona getPersona() {
        return this.titular;
    }
    
    /**
     * Establece el titular
     * 
     * @param   titular
     */
    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }
    
    /**
     * Aumenta el saldo
     * 
     * @param   importe
     * @return  saldo actual
     */
    public double depositar(double p_importe) {
        
    }
    
    /**
     * Disminuye el saldo
     * 
     * @param   importe
     * @return  saldo actual
     */
    public double extraer(double p_importe) {
        
    }
    
    /**
     * Muestra por pantalla los datos del titular y saldo
     */
    public void mostrar() {
        
    }
    
    /**
     * Devuelve el numero de cuenta, titular y saldo en una sola linea
     * 
     * @return  numero de cuenta, titular y saldo
     */
    public String toString() {
        
    }
}
