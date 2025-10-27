
package ejercicios;
//Crear un programa con una constante PI con un valor. Escribir su valor. Intentar cambiar el valor y ver si nos lo permite.

public class ConstantePI {
    public static void main(String[] args) {
        // 1️Definir una constante PI
        final double PI = 3.1416;

        // 2️ Escribir su valor
        System.out.println("El valor de PI es: " + PI);

        // 3️ Intentar cambiar el valor (esto causará un error)
        // PI = 3.14; // ❌ Error: no se puede asignar un valor a una variable final

        // Si descomentas la línea anterior, el programa NO compilará
    }
}
