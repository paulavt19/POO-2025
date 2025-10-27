
package ejercicios;
// Escribir un programa que escriba por pantalla dos números al azar entre 10 y 20

public class NumAzar10Y20Math {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 11 ) + 10;
        int num2 = (int) (Math.random() * 11) + 10;
        
        System.out.println("El primer número al azar es: " + num1);
        System.out.println("El segundo número al azar es: " + num2);
    }
}
