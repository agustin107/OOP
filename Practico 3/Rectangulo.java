
/**
 * Clase Rectangulo
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class Rectangulo
{ 
    private Punto origen;
    private double ancho;
    private double alto;
    
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    public Rectangulo(double p_ancho, double p_alto){
        this.setOrigen(new Punto());
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    public double getAncho(){
        return this.ancho;
    }
    public double getAlto(){
        return this.alto;
    }
    public Punto getOrigen(){
        return this.origen;
    }
    /**
    * Metodo que produce un desplazamiento del punto al sumarle a sus coordenadas x e y, el valor que contienen las variables dx y dy que representan el desplazamiento 
    * que realiza cada punto 
    * @param variables del tipo double dx y dy
    */
    public void desplazar(double p_dx,double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    public void caracteristicas(){
        System.out.println ("Rectangulo");
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " - " + "Alto: " + this.getAlto() +" - " + "Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " " + "Perimetro: " + this.perimetro());
    }
    public double superficie(){
        double superficie = this.getAncho() * this.getAlto();
        return superficie;
    }
    public double perimetro(){
        double perimetro = ((2 * this.getAncho()) + (2 * this.getAlto()));
        return perimetro;
    }
    public Rectangulo elMayor(Rectangulo otroRectangulo){
    
        if (this.superficie() > otroRectangulo.superficie()){
            return this;
        }
        else{
            return otroRectangulo;
        }
    }
    public double distanciaA (Rectangulo otroRectangulo){
        Punto a = this.getOrigen();
        Punto b = otroRectangulo.getOrigen();  
        return a.distanciaA(b);
    }  
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
