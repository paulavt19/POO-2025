
package recetasfastfood;

import java.util.ArrayList;


public class Sandwich extends Receta {

    public Sandwich(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        int vocales = 0;
        for (char c : nombre.toLowerCase().toCharArray()) {
        if ("aeiou".indexOf(c) != -1) {
            vocales++;
        }
    }    
        return 2 + vocales;    
    }

    @Override
    public boolean isVegetariano() {
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "plancha";
    } 
}
