
/**
 * Clase Rectangulo
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Rectangulo
{
    // atributos
    private Punto origen;
    private double ancho;
    private double alto;

    /**
     * Constructor de la clase
     * 
     * @param   origen, ancho y alto
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto)
    {
        // inicializo los atributos
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    /**
     * Constructor de la clase
     * 
     * @param   ancho y alto
     */
    public Rectangulo(double p_ancho, double p_alto) {
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    /**
     * Devuelve el origen
     * 
     * @return  origen
     */
    public Punto getOrigen() {
        return this.origen;
    }
    
    /**
     * Establece el origen
     * 
     * @param   origen
     */
    private void setOrigen(Punto p_origen) {
        this.origen = p_origen;
    }
    
    /**
     * Devuelve el ancho
     * 
     * @return  ancho
     */
    public double getAncho() {
        return this.ancho;
    }
    
    /**
     * Establece el ancho
     * 
     * @param   ancho
     */
    private void setAncho(double p_ancho) {
        this.ancho = p_ancho;
    }
    
    /**
     * Devuelve el alto
     * 
     * @return  alto
     */
    public double getAlto() {
        return this.alto;
    }
    
    /**
     * Establece el alto
     * 
     * @param   alto
     */
    private void setAlto(double p_alto) {
        this.alto = p_alto;
    }
    
    /**
     * Desplaza, cambiando su origen a otra posicion
     * 
     * @param   desplazo de x y desplazo de y
     */
    public void desplazar(double p_dx, double p_dy) {
        
    }
    
    /**
     * Muestra las caracteristicas
     */
    public void caracteristicas() {
        
    }
    
    /**
     * Calcula el perimetro
     * 
     * @return  perimetro
     */
    public double perimetro() {
        
    }
    
    /**
     * Calcula la superficie
     * 
     * @return  superficie
     */
    public double superficie() {
        
    }
    
    /**
     * Calcula la distancia entre el mismo y otro rectangulo
     * 
     * @param   rectangulo
     * @return  distancia entre ambos rectangulo
     */
    public double distanciaA(Rectangulo otroRectangulo) {
        
    }
    
    /**
     * Calcula el mayor entre dos rectangulo
     * 
     * @param   rectangulo
     * @return  rectangulo
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo) {
        
    }
}
