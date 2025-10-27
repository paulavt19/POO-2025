
package ejercicios;

import java.util.Random;
// Escribir un programa que escriba por pantalla un numero al azar entre 0 y 99.

public class NumeroAlAzar {
    public static void main(String[] args) {
    Random random = new Random();
    
    int numRam = random.nextInt(100);
        System.out.println(numRam);
    }
}
