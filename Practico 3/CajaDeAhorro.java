
/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class CajaDeAhorro
{ 
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    public CajaDeAhorro (int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
    }
    public CajaDeAhorro (int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
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
    
    /** Setter ExtraccionesPosibles.
    * @param p_extraccionesPosibles se asigna a extraccionesPosibles.
    */
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
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
    
    /** Getter ExtraccionesPosibles.
    * @return extraccionesPosibles de tipo int.
    */
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
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
        if ((this.getSaldo() - p_importe)>= 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    private String motivo(double p_importe){
        if ((this.puedeExtraer(p_importe) == false) && (this.getExtraccionesPosibles() > 0)){
            return "No puede extraer mas que el saldo!";
        }
        else{
            return "No tiene habilitadas mas exttracciones!";
        }
    }
    private void extraccion (double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    public void mostrar(){
        System.out.println("Caja de Ahorro - ");    
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "  -  " + "Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones Posibles: " + this.getExtraccionesPosibles());
    }
}
 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     