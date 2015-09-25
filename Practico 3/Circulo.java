
/**
 * Clase Circulo
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class Circulo
{ 
    private double radio;
    private Punto centro;
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    public Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto());
    }
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    public Punto getCentro(){
        return this.centro;
    }
    public double getRadio(){
        return this.radio;
    }
    public void desplazar(double p_dx,double p_dy){
        this.getCentro().desplazar(p_dx , p_dy);
    }
    public void caracteristicas(){
        System.out.println("Circulo");
        System.out.println("Centro: " + this.getCentro().coordenadas());
        System.out.println("Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie());
        System.out.println("Perimetro: " + this.perimetro());
    }
    public double superficie(){
        double superficie = (Math.pow((Math.PI * this.getRadio()),2));
        return superficie;
    }
    public double perimetro(){
        double perimetro = (2 * Math.PI * this.getRadio());
        return perimetro;
    }    
    public Circulo elMayor(Circulo otroCirculo){
    if (this.superficie() > otroCirculo.superficie()){
        return this;
    }
    else{
        return otroCirculo;
    }
    }
    public double distanciaA (Circulo otroCirculo){
        Punto a = this.getCentro();
        Punto b = otroCirculo.getCentro();  
        double dist = a.distanciaA(b);
        return dist;
    }
}       
 