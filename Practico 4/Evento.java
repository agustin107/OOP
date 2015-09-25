
/**
 * Write a description of class Evento here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Evento
{
    private String nombre;
    private String lugar;
    private int diasInscripcion;
    private double costo;
    private Fecha fechaEvento;
    
    public Evento(String p_nombre,String p_lugar,Fecha p_fechaEvento,int p_diasIns, double p_costo){
        this.setNombre(p_nombre);
        this.setLugar(p_lugar);
        this.setFechaEvento(p_fechaEvento);
        this.setDiasInscripcion(p_diasIns);
        this.setCosto(p_costo);
    }
    
    private void setNombre(String p_nombre){this.nombre=p_nombre;}
    private void setLugar(String p_lugar){this.lugar=p_lugar;}
    private void setDiasInscripcion(int p_diasInscripcion){this.diasInscripcion=p_diasInscripcion;}
    private void setCosto(double p_costo){this.costo=p_costo;}
    private void setFechaEvento(Fecha p_fechaEvento){this.fechaEvento=p_fechaEvento;}
    
    public String getNombre(){return this.nombre;}
    public String getLugar(){return this.lugar;}
    public int getDiasInscripcion(){return this.diasInscripcion;}
    public double getCosto(){return this.costo;}
    public Fecha getFechaEvento(){return this.fechaEvento;}
    
    public Fecha fechaInscripcion(){
        return this.getFechaEvento();
    }
    
    public String costoFinal(int p_edadInvitado){
        if (p_edadInvitado >= 30){
            double descuento = this.getCosto()*10/100;
            return "$" + (this.getCosto()- descuento) + " (incluye descuento)";
        }else{
            return "$"+ this.getCosto();
        }
    }
}
