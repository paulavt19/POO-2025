
package recetasfastfood;

import java.util.ArrayList;


public class Menu {
    private ArrayList<IFastFood> listaMenu;
    
    public Menu() {
        listaMenu = new ArrayList<>();
    }
    
    public ArrayList<IFastFood> getListaMenu() {
        return listaMenu;
    }
    
    public void setListaMenu(ArrayList<IFastFood> listaMenu) {
        this.listaMenu = listaMenu;
    }    
    
    public void agregarReceta(IFastFood receta) {
        listaMenu.add(receta);
    }

    public void mostrarRecetas() {
    if (listaMenu.isEmpty()) {
        System.out.println("El menú está vacío.");
    } else {
        for (IFastFood receta : listaMenu) {
            if (receta instanceof Receta r) {
                System.out.println("- " + r.getNombre());
            }
        }
    }
}
    
    public ArrayList<IFastFood> getRecetas() {
        return listaMenu; // Devuelve la lista actual del menú
    }

    // Método para calcular el tiempo medio de preparación
    public double tiempoMedio() {
        if (listaMenu.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (IFastFood receta : listaMenu) {
            suma += receta.tiempoDePreparacion();
        }
        return (double) suma / listaMenu.size();
    }

    // Método para calcular el porcentaje de recetas vegetarianas
    public double porcentajeVegetariano() {
        if (listaMenu.isEmpty()) {
            return 0;
        }
        int contador = 0;
        for (IFastFood receta : listaMenu) {
            if (receta.isVegetariano()) {
                contador++;
            }
        }
        return (double) contador * 100 / listaMenu.size();
    }
}