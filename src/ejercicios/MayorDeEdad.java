
package ejercicios;
//Pide un nombre y una edad. Luego nos dice por consola: "El señor/a XXXXX hace YYYY años que es mayor de edad".

import java.util.Scanner;


public class MayorDeEdad {
    public static void main(String[] args) {
        String nombre;
        int edad;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su nombre: " );
        nombre = in.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = in.nextInt();
        
        int añosMayor = edad - 18;
        
        if (edad >= 18){
            System.out.println(" La señora " + nombre + " hace " + añosMayor + " años que es mayor de edad. ");
        } else {
            System.out.println(" La señora " + nombre + " todavía no es mayor de edad ");
        }
    }
}
