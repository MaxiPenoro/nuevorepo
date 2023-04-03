/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
    Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejerecicio3_clase3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Maxi
 */
public class Ejerecicio3_clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase.");
        frase = leer.nextLine();
        frase = toUpperCase(frase);
        System.out.println(frase);
        frase = toLowerCase(frase);
        System.out.println(frase);
        
        
        
        
        
    }
    
}
