
/**
 * Clase Punto
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class Punto
{  
    private double x;
    private double y;
    /**
    * Constructor en el cual se incializan los atributos x e y en 0 para que los puntos esten en el origen del eje de coordenadas
    */
    public Punto(){
        this.setX(0);
        this.setY(0);
    }
    
    public Punto(double p_x, double p_y){
       this.setX(p_x);
       this.setY(p_y);
    }
    private void setX(double p_x){
        this.x = p_x;
    }
    private void setY(double p_y){
        this.y = p_y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    /**
    * Metodo que produce un desplazamiento del punto al sumarle a sus coordenadas x e y, el valor que contienen las variables dx y dy que representan el desplazamiento 
    * que realiza cada punto 
    * @param variables del tipo double dx y dy
    */
    public void desplazar(double p_dx,double p_dy){
        this.setX(getX() + p_dx);
        this.setY(getY() + p_dy);
    }
    
    /**
    * Metodo que nos devuelve una leyenda con las coordenadas del punto en el sistema de coordenadas
    * 
    * 
    * @return una leyenda de tipo String
    */
    public String coordenadas(){
        return ("(" + this.getX() + "," + this.getY() + ")");
    }
    /**
    * Metodo imprime la leyenda que nos indica el valor del punto X y el valor del punto Y
    */
    public void mostrar(){
        System.out.println("Punto" + " " + "X: " + this.getX() + " " + "Y: " + this.getY());
    }
    public double distanciaA(Punto p_ptoDistante){  
        double distancia = (Math.sqrt(Math.pow((p_ptoDistante.getX() - this.getX()), 2)) + (Math.pow ((p_ptoDistante.getY() - this.getY()), 2)));
        return distancia;
    }
}

   
        
    

   