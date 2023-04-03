/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
    La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio4_clase3;

import java.util.Scanner;


/**
 *
 * @author Maxi
 */
public class Ejercicio4_clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese los grados celcius.");
        num = leer.nextInt();
        int fah = 32 + (9 * num / 5);
        System.out.println("Los grados en Fahrenheit: " + fah);
    }
    
}
