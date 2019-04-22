package ventavehiculo;
import java.util.Scanner;

public class EntradaSalida {

    public EntradaSalida() {
    }
    
    public static void imprimir(String cadena){
        System.out.print(cadena);
    }
    
    public static void imprimirLinea(String cadena){
        System.out.println(cadena);
    }   
    
    public static String ingresoDeDatos(){
        Scanner lector = new Scanner(System.in);
        return lector.nextLine();
    }    
}
