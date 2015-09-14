
/**
 * Clase Producto.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0.0
 */
public class Producto
{
    // Variables de instancia de la clase
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    /**
     * Constructor de la clase
     */
    public Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, Laboratorio p_laboratorio)
    {
        // Inicializo las variables de instancias
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_descripcion);
        this.setCosto(p_costo);
        this.setLaboratorio(p_laboratorio);
        this.setStock(0);
    }

    /**
     * Metodo que retorna el estado actual del codigo del producto
     * 
     * @return     el codigo del producto.
     */
    public int getCodigo() {
        return this.codigo;
    }
    
    /**
     * Metodo que actualiza el estado actual del codigo del producto
     * 
     * @param   codigo
     */
    private void setCodigo(int p_codigo) {
        this.codigo = p_codigo;
    }
    
    /**
     * Metodo que retorna el estado actual del rubro del producto
     * 
     * @return     el rubro del producto.
     */
    public String getRubro() {
        return this.rubro;
    }
    
    /**
     * Metodo que actualiza el estado actual del rubro del producto
     * 
     * @param   rubro
     */
    private void setRubro(String p_rubro) {
        this.rubro = p_rubro;
    }
    
    /**
     * Metodo que retorna el estado actual de la descripcion del producto
     * 
     * @return     descripcion del producto.
     */
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
     * Metodo que actualiza el estado actual de la descripcion del producto
     * 
     * @param   descripcion
     */
    private void setDescripcion(String p_descripcion) {
        this.descripcion = p_descripcion;
    }
    
    /**
     * Metodo que retorna el estado actual del codigo del producto
     * 
     * @return     costo del producto.
     */
    public double getCosto() {
        return this.costo;
    }
    
    /**
     * Metodo que actualiza el estado actual del costo del producto
     * 
     * @param     costo
     */
    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }
    
    /**
     * Metodo que retorna el estado actual del stock del producto
     * 
     * @return     stock del producto.
     */
    public int getStock() {
        return this.stock;
    }
    
    /**
     * Metodo que actualiza el estado actual del stock del producto
     * 
     * @param   stock
     */
    private void setStock(int p_stock) {
       this.stock = p_stock;
    }
    
    /**
     * Metodo que retorna el estado actual del stock del producto
     * 
     * @return     porcPtoRepo del producto.
     */
    public double getPorcPtoRepo() {
        return this.porcPtoRepo;
    }
    
    /**
     * Metodo que actualiza el estado actual del porcPtoRepo del producto
     * 
     * @param   porcPtoRepo
     */
    private void setPorcPtoRepo(double p_porcPtoRepo) {
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    /**
     * Metodo que retorna el estado actual del stock del producto
     * 
     * @return     existMinima del producto.
     */
    public int getExistMinima() {
        return this.existMinima;
    }
    
    /**
     * Metodo que actualiza el existMinima actual del stock del producto
     * 
     * @param     existMinima del producto.
     */
    private void setExistMinima(int p_existMinima) {
        this.existMinima = p_existMinima;
    }
    
    /**
     * Metodo que retorna el estado actual del laboratorio del producto
     * 
     * @return     laboratorio del producto.
     */
    public Laboratorio getLaboratorio() {
        return this.laboratorio;
    }
    
    /**
     * Metodo que actualiza el estado actual del laboratorio del producto
     * 
     * @param     laboratorio
     */
    private void setLaboratorio(Laboratorio p_laboratorio) {
        this.laboratorio = p_laboratorio;
    }
    
    public void mostrar() {
        System.out.println("Laboratorio: " + this.laboratorio.getNombre());
        System.out.println("Domicilio: " + this.laboratorio.getDomicilio() + "\t - Telefono: " + this.laboratorio.getTelefono());
        System.out.println("");
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDescripcion());
        System.out.println("Precio Costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + "\t - Stock Valorizado: " + this.stockValorizado());
    }
    
    public void ajuste(int p_cantidad) {
        this.setStock(p_cantidad);
    }
    
    public double stockValorizado() {
        double stockValorizado = 0;
        
        stockValorizado = this.getStock() * this.precioLista();
        return stockValorizado;
    }
    
    public double precioLista() {
        double precioLista = 0;
        
        precioLista = this.getCosto() * 0.12;
        return precioLista;
    }
    
    public double precioContado() {
        double precioContado = 0;
        
        precioContado = this.precioLista() - this.precioLista() * 0.12;
        return precioContado;
    }
    
    public String mostrarLinea() {
        String linea;
        
        linea = this.getDescripcion() + "\t" + this.precioLista() + "\t" + this.precioContado();
        return linea;
    }
}
