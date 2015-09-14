
/**
 * Clase Cliente
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Cliente
{
    // atributos
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;

    /**
     * Constructor de la clase
     * 
     * @param   dni, apellido, nombre, importe
     */
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe) {
        // initialise instance variables
        this.setNroDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }
    
    /**
     * Devuelve el numero de DNI
     * 
     * @return  numero de DNI
     */
    public int getNroDNI() {
        return this.nroDni;
    }
    
    /**
     * Establece el numero de DNI
     * 
     * @param   numero de DNI
     */
    private void setNroDNI(int p_dni) {
        this.nroDni = p_dni;
    }
    
    /**
     * Devuelve el apellido
     * 
     * @return  apellido
     */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
     * Establece el apellido
     * 
     * @param   apellido
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    
    /**
     * Devuelve el nombre
     * 
     * @return  nombre
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Establece el nombre
     * 
     * @param   nombre
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
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
     * @param   importe
     */
    private void setSaldo(double p_importe) {
        this.saldo = p_importe;
    }
    
    /**
     * Establece un nuevo saldo y devuelve el saldo actualizado
     * 
     * @param   importe
     * @return  saldo
     */
    public double nuevoSaldo(double p_importe) {
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    
    /**
     * Actualiza el saldo con el importe agregado
     * 
     * @param   importe
     * @return  saldo
     */
    public double agregaSaldo(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    
    /**
     * Devuelve el apellido y nombre
     * 
     * @return  apellido y nombre
     */
    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Devuelve el nombre y apellido
     * 
     * @return  nombre y apellido
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Muestra por pantalla el nombre y apellido, numero de DNI y saldo
     */
    public void mostrar() {
        System.out.println("- Cliente -");
        System.out.print("Nombre y Apellido: " + this.nomYApe());
        System.out.print("(" + this.getNroDNI() + ")");
        System.out.println("");
        System.out.println("Saldo: " + this.getSaldo());
    }
}
