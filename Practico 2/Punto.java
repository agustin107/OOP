
/**
 * Clase Punto
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Punto
{
    // atributos
    private double x;
    private double y;

    /**
     * Constructor de la clase
     */
    public Punto() {
        // inicializo los atributos
        this.setX(0);
        this.setY(0);
    }
    
    /**
     * Constructor de la clase
     * 
     * @param   x, y
     */
    public Punto(double p_x, double p_y) {
        this.setX(p_x);
        this.setY(p_y);
    }
    
    /**
     * Devuelve x
     * 
     * @return  x
     */
    public double getX() {
        return this.x;
    }
    
    /**
     * Establece x
     * 
     * @param   x
     */
    private void setX(double p_x) {
        this.x = p_x;
    }
    
    /**
     * Devuelve y
     * 
     * @return  y
     */
    public double getY() {
        return this.y;
    }
    
    /**
     * Establece y
     * 
     * @return  y
     */
    private void setY(double p_y) {
        this.y = p_y;
    }
    
    /**
     * Desplaza x e y, sumando nuevos valores
     * 
     * @param   desplazamiento de x, desplazamiento de y
     */
    public void desplazar(double p_dx, double p_dy) {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /**
     * Muestra en pantalla x e y
     */
    public void mostrar() {
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }
    
    /**
     * Devuelve las coordenadas de x e y
     * 
     * @return  x, y
     */
    public String coordenadas() {
        String cadena;
        
        cadena = "(" + this.getX() + ", " + this.getY() + ")";
        return cadena;
    }
}
