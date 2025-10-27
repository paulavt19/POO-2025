
package ejercicios;
//Crear una variable de tipo double, darle valor, almacenar luego dicha variable double en una variable int, y escribir en valor de las dos variables

public class EjemploConversion {
    public static void main(String[] args) {
        // Crear una variable de tipo double y darle un valor
        double numeroDouble = 9.75;

        // ️Almacenar esa variable double en una variable int (con conversión)
        int numeroEntero = (int) numeroDouble; // Se pierde la parte decimal

        // Mostrar los valores de ambas variables
        System.out.println("Valor de la variable double: " + numeroDouble);
        System.out.println("Valor de la variable int: " + numeroEntero);
    }
}

