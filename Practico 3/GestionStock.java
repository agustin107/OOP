import java.util.Scanner;
/**
 * Clase ejecutable GestionStock
 * en la clase se instancia un objeto de tipo Producto
 */
public class GestionStock
{  
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in); 
        Laboratorio colgate = new Laboratorio("Colgate S A", "Scalabrini Ortiz 5524", "54-11-4239-8447");
        Producto jabon = new Producto(1249,"limpieza","jabon deluxe",10,colgate);
        jabon.ajuste(1500);
        jabon.mostrar();
        jabon.ajuste(-200);
        
        System.out.println("Desea conocer Precio de Lista y Precio Contado: s o n");
        char resp = teclado.next().charAt(0);
        if(resp == 's')
        {
            System.out.println(jabon.mostrarLinea());
        }
        
        jabon.mostrar();
    }
}