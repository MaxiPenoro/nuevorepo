/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejercicio5_clase3;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Ejercicio5_clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero.");
        num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        int raiz = (int) Math.sqrt(num);
        System.out.println("El doble: " + doble + " el triple: " + triple + " la raiz cuadrada: " + raiz);
    }
    }
    
}
