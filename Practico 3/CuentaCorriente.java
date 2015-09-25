
/**
 * Write a description of class CuentaCorriente here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class CuentaCorriente
{ 
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    public CuentaCorriente (int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setLimiteDescubierto(500);
    }
    public CuentaCorriente (int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
    }
    /** Setter NroCuenta.
    * @param p_nroCuenta se asigna a nroCuenta.
    */
    public void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    /** Setter Saldo.
    * @param p_saldo se asigna a saldo.
    */   
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    /** Setter Titular.
    * @param p_tirular se asigna a titular.
    */   
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    /** Setter LimiteDescubierto.
    * @param p_limiteDescubierto se asigna a limiteDescubierto.
    */
    private void setLimiteDescubierto(double     p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    
    /** Getter NroCuenta.
    * @return nroCuenta de tipo int.
    */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    /** Setter Saldo.
    * @return saldo de tipo double.
    */
    public double getSaldo(){
        return this.saldo;
    }
    
    /** Getter LimiteDescubierto
    * @return limiteDescubierto de tipo double.
    */
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /** Getter Titular.
    * @return titular de tipo Persona.
    */
    public Persona getTitular(){
        return this.titular;
    }
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    public void extraer (double p_importe){
        if (this.puedeExtraer(p_importe) == true) {
            this.extraccion(p_importe);
        }
        else{
            this.motivo(p_importe);
        }   
    }
    private boolean puedeExtraer(double p_importe){
        if((this.getSaldo()+ this.getLimiteDescubierto()>= p_importe) && (this.getLimiteDescubierto()>=0)){
            return true;
        }
        else{
            return false;
        } 
    }
    
    private String motivo(double p_importe){
        if (this.puedeExtraer(p_importe)== false){
            return "El importe de extraccion sobrepasa el limite descubierto!";
        }
        else
        {
            return (" ");
        }
    }
    private void extraccion (double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    public void mostrar(){
        System.out.println("Cuenta Corriente - ");    
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "  -  " + "Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}
 