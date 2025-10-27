
package ejercicios;

import java.util.Random;
//Escribir un programa que escriba por pantalla dos números al azar entre 10 y 20

public class NumAzar10Y20Ram {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(11) + 10;
        int num2 = random.nextInt(11) + 10;
        System.out.println("uno: " + num1);
        System.out.println("dos: " + num2);
    }
}
