
package multiviviendas;


// Clase principal para probar el funcionamiento
public class Principal {
    public static void main(String[] args) {

        // Crear un piso, un adosado y un chalet
        Piso piso1 = new Piso("Calle Mayor 10", 80, 3, 2);
        Adosado adosado1 = new Adosado("Av. Libertad 15", 120, 2);
        Chalet chalet1 = new Chalet("Calle Las Rosas 7", 200, 5, true);

        // Mostrar la información de cada uno
        System.out.println(piso1);
        
        System.out.println(adosado1);
        
        System.out.println(chalet1);

        // Probar el método aumentarPrecio()
        piso1.aumentarPrecio(5000);
        System.out.println("Nuevo precio del piso: " + piso1.getPrecio());
    }
}

