
package ejercicios;

import java.util.Scanner;
// Crear un programa que pide un nombre por Scanner y escribe en consola “buenas tardes, Sr XX”

public class EntradaSalida {
    public static void main(String[] args) {
        String nombre;
        Scanner in = new Scanner(System.in);
         nombre = in.nextLine();
        System.out.println("Buenas tardes, Sr " + nombre );
    }
}
