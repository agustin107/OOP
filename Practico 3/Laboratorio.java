/**
 * Clase Laboratorio
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class Laboratorio
{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    /**
    * Constructor de la clase Laboratorio. 
    * Se inicializan en cero los setCompraMinima y setDiaEntrega.
    * @param p_nombre define el nombre del laboratorio.
    * @param p_domicilio define el domicilio del laboratorio.
    * @param p_telefono define el teléfono del laboratorio.
    */
    public Laboratorio(String p_nombre,String p_domicilio,String p_telefono){
    this.setNombre(p_nombre);
    this.setDomicilio(p_domicilio);
    this.setTelefono(p_telefono);
    }
    public Laboratorio(String p_nombre, String p_domicilio){
    this.setNombre(p_nombre);
    this.setDomicilio(p_domicilio);
    this.setTelefono(null);
    }
    public Laboratorio(String p_nombre){
    this.setNombre(p_nombre);
    this.setDomicilio(null);
    this.setTelefono(null);
    }
    public void setCompraMinima (int p_compraMinima){
        this.compraMinima = p_compraMinima;
    }
    public int getcompraMinima (){
        return this.compraMinima;
    }
    public void setDiaEntrega (int p_diaEntrega){
        this.diaEntrega = p_diaEntrega;
    }
    public int getdiaEntrega (){
        return this.diaEntrega;
    }
    public void setNombre (String p_nombre){
        this.nombre = p_nombre;
    }
    public void setDomicilio (String p_domicilio){
        this.domicilio = p_domicilio;
    }
    public void setTelefono (String p_telefono){
        this.telefono = p_telefono;
    }
    public String getnombre (){
        return this.nombre;
    }
    public String getdomicilio (){
        return this.domicilio;
    }
    public String gettelefono(){
        return this.telefono;
    }
    public void mostrar () {
        System.out.println ("Laboratorio: " + this.getnombre());
        System.out.println ("Domicilio: " + this.getdomicilio());
        System.out.println ("Telefono: " + this.gettelefono());
    }
}
