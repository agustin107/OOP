
/**
 * La clase producto premite ingresar el producto de un laboratorio.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Producto
{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    /**
     * Constructor de la clase Producto
     * e inicializa en cero setStock.
     * @param p_cod define el codigo del producto.
     * @param p_rubro define el rubro del producto.
     * @param p_desc define la descripcion del producto.
     * @param p_costo define el costo del producto.
     * @param p_lab define al laboratorio.
     * @param p_porcPtoRepo define punto de reposicion.
     * @param p_existMinima define la existencia minima por producto.
     */
    public Producto(int p_cod, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_cod);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
    }
    
    /**
     * Constructor de la clase Producto
     * Se inicializan en cero setPorcPtoRepo, setExistMinima y setStock.
     * @param p_cod define el codigo del producto.
     * @param p_rubro define el rubro del producto.
     * @param p_desc define la descripcion del producto.
     * @param p_costo define el costo del producto.
     * @param p_lab define al laboratorio.
     */
    public Producto(int p_cod, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_cod);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(0.0);
        this.setExistMinima(0);
        this.setLaboratorio(p_lab);
    }
    
    //setters 
    private void setCodigo(int p_cod){ this.codigo = p_cod;}
    private void setRubro(String p_rubro){ this.rubro = p_rubro;}
    private void setDescripcion(String p_desc){ this.descripcion = p_desc;}
    private void setCosto(double p_costo){ this.costo = p_costo;}
    private void setStock(int p_stock){ this.stock = p_stock;}
    private void setPorcPtoRepo(double p_porcPtoRepo){ this.porcPtoRepo = p_porcPtoRepo;}
    private void setExistMinima(int p_existMinima){ this.existMinima = p_existMinima;}
    private void setLaboratorio(Laboratorio p_laboratorio){ this.laboratorio = p_laboratorio;}
    
    //getters
    /**
     * metodo getter, obtiene el codigo del producto.
     * @return Codigo del producto.
     */
    public int getCodigo(){return this.codigo;}
    
    public String getRubro(){ return this.rubro;}
    public String getDescripcion(){return this.descripcion;}
    public double getCosto(){return this.costo;}
    public int getStock(){return this.stock;}
    public double getPorcPtoRepo(){return this.porcPtoRepo;}
    public int getExistMinima(){return this.existMinima;}
    public Laboratorio getLaboratorio(){return this.laboratorio;}
    
    /**
     * Este método podra modificar el stock del producto.
     */
    public void ajuste(int p_cantidad){
        this.setStock(this.getStock()+p_cantidad);
       }
    
    /**
     * Este metodo agrega un 12% al precio costo.
     * @return Valor del producto con un 12% agregado.
     */
    public double precioLista(){
        return ((this.getCosto()*12)/100)+this.getCosto();
    }
    
    /**
     * Este método calcula el precio por pago contado, restando un 5% 
     * al precio de lista.
     * @return devuelve el valor del producto por pago contado.
     */
    public double precioContado(){
        return this.precioLista()-((this.precioLista()*5)/100);
    }
    
    /**
      * Este método calcula el stock valorizado, donde multiplica el stock por el precio de costo,
      * mas una rentabilidad del 12%
      * @return devuelve el valor del stock
      */
    //la rentabilidad seria el precioLista que calcula el 12%
    public double stockValorizado() {
       return this.getStock() * this.precioLista();
    }
    
    /**
     * Este método concatena en foma lineal Nombre del producto - precio lista - precio contado
     * @return Un string con la descripcion, precio lista, precio contado del producto.
     */
    public String mostrarLinea(){
        return (this.getDescripcion()+"   "+this.precioLista()+"   "+this.precioContado());
    }
    
    /**
     * Este método muestra por pantalla el nombre del laboratorio, y el producto detallado 
     * (rubro, descripcion, precio costo, stock y stock valorizado)
     */
    public void mostrar(){
        this.getLaboratorio().mostrar();
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDescripcion());
        System.out.println("Precio Costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + "  - Stock valorizado: $" + this.stockValorizado());
    }
    
    public double ptoReposicion(){
        return this.getExistMinima()*(1+this.getPorcPtoRepo()/100);
    }
    
    public char solicitar(){
        char razonCompra = 'N';
        
        if(this.getStock()<= this.getLaboratorio().getCompraMinima()){
            razonCompra = 'F';
        }else 
        if(this.getStock()<=this.ptoReposicion() && this.getLaboratorio().diasParaEntregar()>5)
        {
            razonCompra = 'P';
        }
        
        return razonCompra;
    }
}