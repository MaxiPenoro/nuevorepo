/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1_clase3;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio1_clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un numero entero.");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero.");
        num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los enteros es: " + suma);
        
        
    }
    
}
