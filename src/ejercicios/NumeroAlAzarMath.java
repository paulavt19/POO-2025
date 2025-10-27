
package ejercicios;
// Escribir un programa que escriba por pantalla un numero al azar entre 0 y 99.

public class NumeroAlAzarMath {
    public static void main(String[] args) {
    int numero = (int)(Math.random() * 100);
        System.out.println("El número al azar es: " + numero);
    }  
}
