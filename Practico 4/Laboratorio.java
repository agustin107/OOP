import java.util.*;
/**
 * La clase Laboratorio permite ingresar los datos (Nombre, Domicilio, Teléfono, Compra mínima, Día de entrega) de un laboratorio. 
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Laboratorio
{
   private String nombre;
   private String domicilio;
   private String telefono;
   private int compraMinima;
   private int diaEntrega;
   
   //contructor declarado para poder enviar los valores de compraMinima y diaEntrega.
   public Laboratorio(String p_nombre, String p_domicilio, String p_telefono,int p_compraMinima, int p_diaEntrega){
       this.setNombre(p_nombre);
       this.setDomicilio(p_domicilio);
       this.setTelefono(p_telefono);
       this.setCompraMinima(p_compraMinima);
       this.setDiaEntrega(p_diaEntrega);
   }
   
   /**
    * Constructor de la clase Laboratorio. 
    * Se inicializan en cero los setCompraMinima y setDiaEntrega.
    * @param p_nombre define el nombre del laboratorio.
    * @param p_domicilio define el domicilio del laboratorio.
    * @param p_telefono define el teléfono del laboratorio.
    */
   public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
       this.setNombre(p_nombre);
       this.setDomicilio(p_domicilio);
       this.setTelefono(p_telefono);
       this.setCompraMinima(0);
       this.setDiaEntrega(0);
   }
   
   /**
    * Constructor de la clase Laboratorio. 
    * setCompraMinima y setDiaEntrega, se inicializan en cero.
    * setTelefono, se inicializa con espacio en blanco.
    * @param p_nombre define el nombre del laboratorio.
    * @param p_domicilio define el domicilio del laboratorio.
    */
   public Laboratorio(String p_nombre, String p_domicilio){
       this.setNombre(p_nombre);
       this.setDomicilio(p_domicilio);
       this.setTelefono(" ");
       this.setCompraMinima(0);
       this.setDiaEntrega(0);
   }
   
   /**
    * Constructor de la clase Laboratorio. 
    * setCompraMinima y setDiaEntrega, se inicializan en cero.
    * setDomicilio y setTelefono, se inicializa con espacio en blanco.
    * @param p_nombre define el nombre del laboratorio.
    */
   public Laboratorio(String p_nombre){
       this.setNombre(p_nombre);
       this.setDomicilio(" ");
       this.setTelefono(" ");
       this.setCompraMinima(0);
       this.setDiaEntrega(0);
   }
   
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
   }
   
   /**
     * Método donde se obtiene el nombre del laboratorio.
     * @return Devuelve el nombre del laboratorio.
     */
   public String getNombre(){
       return this.nombre;
   }
   
   private void setDomicilio(String p_domicilio){
       this.domicilio = p_domicilio;
   }
   
   /**
     * Método donde se obtiene el domicilio del laboratorio.
     * @return Devuelve el domicilio del laboratorio.
     */
   public String getDomicilio(){
       return this.domicilio;
   }
   
   private void setTelefono(String p_telefono){
       this.telefono = p_telefono;
   }
   
   /**
     * Método donde se obtiene el telefono del laboratorio.
     * @return Devuelve el telefono del laboratorio.
     */
   public String getTelefono(){
       return this.telefono;
   }
   
   public void setCompraMinima(int p_compraMinima){
       this.compraMinima = p_compraMinima;
   }
   
   /**
     * Método donde se obtiene la compra minima del laboratorio.
     * @return Devuelve la compra minima del laboratorio.
     */
   public int getCompraMinima(){
       return this.compraMinima;
   }
   
   public void setDiaEntrega(int p_diaEntrega){
       this.diaEntrega = p_diaEntrega;
   }
   
   /**
    * Método que obtiene el día de entrega del laboratorio.
    * @return Devuelve el día de entreda.
    */
   public int getDiaEntrega(){
       return this.diaEntrega;
   }
   
   /**
    * El método muestra por pantalla el nombre del laboratorio, domicilio y teléfono.
    */
   public void mostrar(){
       System.out.println("Laboratorio: "+this.getNombre());
       System.out.println("Domicilio: "+this.getDomicilio()+"  -Telefono: "+this.getTelefono());   
   }
   
   /**
    * El método calcula en cuantos dias realizara la entrega.
    * Aclaración: se supone que todos los meses tienen 30 dias.
    * 
    * @return Tipo int, cantidad de dias q falta para realizar la entrega.
    */
   public int diasParaEntregar(){
       Calendar fechaHoy = Calendar.getInstance();
       int calculo = fechaHoy.get(Calendar.DATE) - this.getDiaEntrega();
       if (calculo == 0){
           return 30; 
       }else{
            return calculo;
       }
   }
}