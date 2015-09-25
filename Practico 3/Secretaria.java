
/**
 * Write a description of class Secretaria here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class Secretaria
{ 
    public static void main(String[] args){
        Escuela nuevaEscuela = new Escuela("Manuel Belgrano", "Irigoyen 1580", "Leopoldo Juez");
        Docente nuevoDocente = new Docente("Elisa Sanchez", "Quinto Grado", 1600,1290);
        nuevaEscuela.ImprimirRecibo(nuevoDocente);
    }
}