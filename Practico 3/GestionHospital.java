
/**
 * Write a description of class GestionHospital here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class GestionHospital
{
    public static void main(String[] args) {
        Hospital nuevoHospital = new Hospital("Garrahan", "Leonardo Ruiz");
        Localidad localidad = new Localidad ("Monte Caseros", "Corrientes");
        Paciente nuevoPaciente = new Paciente(578669, "Juan Manuel Ortigoza", "Bulevar 3 de Abril", localidad, localidad);
        nuevoHospital.consultaDatosFiliatorios(nuevoPaciente);
    }
}
