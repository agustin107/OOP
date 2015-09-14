
/**
 * Clase Alumno
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Alumno
{
    // atributos
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;

    /**
     * Constructor de la clase
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido) {
        // inicializo los atributos
        this.setLU(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0);
        this.setNota2(0);
    }
    
    /**
     * Devuelve la LU
     * 
     * @return  LU
     */
    public int getLU() {
        return this.lu;
    }
    
    /**
     * Establece la LU
     * 
     * @param   LU
     */
    private void setLU(int p_lu) {
        this.lu = p_lu;
    }
    
    /**
     * Devuelve el nombre
     * 
     * @return  nombre
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Establece el nombre
     * 
     * @param   nombre
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Devuelve el apellido
     * 
     * @return  apellido
     */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
     * Establece el apellido
     * 
     * @param   apellido
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    
    /**
     * Devuelve la primera nota
     * 
     * @return primera nota
     */
    public double getNota1() {
        return this.nota1;
    }
    
    /**
     * Establece la primera nota
     * 
     * @param   primera nota
     */
    public void setNota1(double p_nota) {
        this.nota1 = p_nota;
    }
    
    /**
     * Devuelve la segunda nota
     * 
     * @return  segunda nota
     */
    public double getNota2() {
        return this.nota2;
    }
    
    /**
     * Establece la segunda nota
     * 
     * @param   segunda nota
     */
    public void setNota2(double p_nota) {
        this.nota2 = p_nota;
    }
    
    /**
     * Calcula si aprueba o no
     * 
     * @return  true en caso de que apruebe y false de lo contrario
     */
    private boolean aprueba() {
        if(promedio() > 6) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Devuelve una leyenda depende de si aprueba o no
     * 
     * @return  leyenda de aprueba o desaprobado
     */
    private String leyendaAprueba() {
        if(aprueba()) {
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }
    
    /**
     * Devuelve el promedio de las notas
     * 
     * @return  promedio
     */
    public double promedio() {
        double promAux = 0;
        promAux = (this.getNota1() + this.getNota2()) / 2;
        return promAux;
    }
    
    /**
     * Devuelve el nombre y apellido
     * 
     * @return  nombre y apellido
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Devuelve el apellido y nombre
     * 
     * @return  apellido y nombre
     */
    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Muestra por pantalla el nombre y apellido, LU,
     * notas y promedio.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.apeYNom());
        System.out.print("LU: " + this.getLU());
        System.out.print("\t Notas: " + this.getNota1() + " - " + this.getNota2());
        System.out.println("");
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
    }
}
