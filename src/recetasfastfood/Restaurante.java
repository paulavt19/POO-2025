
package recetasfastfood;

import java.util.ArrayList;
import java.util.HashMap;


public class Restaurante {
    private final HashMap<String, IFastFood> mapaRecetasRestaurante;
    private final Menu menu;
    
    public Restaurante() {
        mapaRecetasRestaurante = new HashMap<>();
        menu = new Menu();
    }
    
    public void crearRecetas() {
    ArrayList<String> ingredientesPizza = new ArrayList<>();
    ingredientesPizza.add("Carne molida");
    ingredientesPizza.add("Queso");

    ArrayList<String> pasosPizza = new ArrayList<>();
    pasosPizza.add("Preparar masa");
    pasosPizza.add("Hornear");

    Receta pizza1 = new Pizza("Pizza Carne", ingredientesPizza, pasosPizza);

    ArrayList<String> ingredientesSandwich = new ArrayList<>();
    ingredientesSandwich.add("Lechuga");
    ingredientesSandwich.add("Tomate");

    ArrayList<String> pasosSandwich = new ArrayList<>();
    pasosSandwich.add("Tostar pan");
    pasosSandwich.add("Armar sandwich");

    Receta sandwich1 = new Sandwich("Sandwich Vegetariano", ingredientesSandwich, pasosSandwich);

    mapaRecetasRestaurante.put(pizza1.getNombre(), pizza1);
    mapaRecetasRestaurante.put(sandwich1.getNombre(), sandwich1);
}
    public void mostrarRecetasDisponibles() {
        System.out.println("Recetas disponibles en el restaurante:");
        for (String nombre : mapaRecetasRestaurante.keySet()) {
            System.out.println(" " + nombre);   
        }
    }
    
    public void agregarRecetaAlMenu(String nombreReceta) {
        IFastFood receta = mapaRecetasRestaurante.get(nombreReceta);
        if (receta != null) {
            menu.agregarReceta(receta);
            System.out.println("Receta Agregada al menú:" + nombreReceta);
        }else{
            System.out.println("No existe una receta con ese nombre:");
        }
    }
    
    public void mostrarMenu() {
        System.out.println("Menú del día:");
        menu.mostrarRecetas();
    }
    
    public double tiempoMedio() {
        ArrayList<IFastFood> recetasMenu = menu.getRecetas();
        if (recetasMenu.isEmpty()) {
            return -1; // si el menú está vacío
        }
        
        int sumaTiempos = 0;
        for (IFastFood receta : recetasMenu) {
            sumaTiempos += receta.tiempoDePreparacion();
        }
        return (double) sumaTiempos / recetasMenu.size();
    }

   
    public double porcentajeVegetariano() {
        ArrayList<IFastFood> recetasMenu = menu.getRecetas();
        if (recetasMenu.isEmpty()) {
            return 0; 
        }
        
        int contadorVegetarianos = 0;
        for (IFastFood receta : recetasMenu) {
            if (receta.isVegetariano()) {
                contadorVegetarianos++;
            }
        }
        
        return (contadorVegetarianos * 100.0) / recetasMenu.size();
    }

    // 🧾 Método main para probar todo
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.crearRecetas();

        System.out.println("=== RECETAS DISPONIBLES ===");
        restaurante.mostrarRecetasDisponibles();

        System.out.println("=== AGREGANDO RECETAS AL MENÚ ===");
        restaurante.agregarRecetaAlMenu("Pizza Carne");
        restaurante.agregarRecetaAlMenu("Sandwich Vegetariano");

        System.out.println("=== MENÚ DEL DÍA ===");
        restaurante.mostrarMenu();

        double promedio = restaurante.tiempoMedio();
        if (promedio == -1) {
            System.out.println(" No hay recetas en el menú para calcular el tiempo medio.");
        } else {
            System.out.println(" Tiempo medio de preparación: " + promedio + " minutos");
        }

        double porcentaje = restaurante.porcentajeVegetariano();
        System.out.println("Porcentaje de recetas vegetarianas: " + porcentaje + "%");

    }
}

    



  
    

