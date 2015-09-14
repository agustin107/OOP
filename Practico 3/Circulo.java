
/**
 * Clase Circulo
 * 
 * @author Agustin N. R. Ramirez
 * @see Punto
 * @version 1.0
 */
public class Circulo
{
    // atributos
    private double radio;
    private Punto centro;

    /**
     * Constructor de la clase
     */
    public Circulo(double p_radio, Punto p_centro)
    {
        // inicializo los atributos
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    /**
     * Constructor de la clase
     */
    public Circulo() {
        Punto punto = new Punto(0, 0);
        
        this.setRadio(0);
        this.setCentro(punto);
    }
    
    /**
     * Devuelve el radio
     * 
     * @return     radio
     */
    public double getRadio()
    {
        return this.radio;
    }
    
    /**
     * Establece el radio
     * 
     * @param   radio
     */
    private void setRadio(double p_radio) {
        this.radio = p_radio;
    }
    
    /**
     * Devuelve el centro
     * 
     * @return  centro
     */
    public Punto getCentro() {
        return this.centro;
    }
    
    /**
     * Establece el centro
     * 
     * @param   centro
     */
    private void setCentro(Punto p_centro) {
        this.centro = p_centro;
    }
    
    /**
     * Realiza un desplazamiento
     * 
     * @param   distancia de x, distancia de y
     */
    public void desplazar(double p_dx, double p_dy) {
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    /**
     * Muestra las caracteristicas
     */
    public void caracteristicas() {
        System.out.println("********** Circulo **********");
        System.out.println("Centro: " + this.getCentro().coordenadas() + "\t - Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + "\t - Perimetro: " + this.perimetro());
    }
    
    /**
     * Calcula el perimetro
     * 
     * @return  perimetro
     */
    public double perimetro() {
        double perimetro;
        
        return perimetro;
    }
    
    /**
     * Calcula la superficie
     * 
     * @return  superficie
     */
    public double superficie() {
        double superficie;
        
        return superficie;
    }
    
    /**
     * Calcula la distancia entre el mismo y otro circulo
     * 
     * @param   circulo
     * @return  distancia entre ambos
     */
    public double distanciaA(Circulo otroCirculo) {
        
    }
    
    /**
     * Calcula cual es el mayor entre el mismo y otro circulo
     * 
     * @param   circulo
     * @return  circulo mayor
     */
    public Circulo elMayor(Circulo otroCirculo) {
        
    }
}
