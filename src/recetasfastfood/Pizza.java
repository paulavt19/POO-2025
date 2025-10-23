
package recetasfastfood;

import java.util.ArrayList;


public class Pizza extends Receta {
    
    public Pizza(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        return 2 + nombre.length(); 
    }

    @Override
    public boolean isVegetariano() {
        for( String ingrediente : ingredientes){
           if( ingrediente.toLowerCase().contains("carne")){
               return false;
               
           } 
            
        } 
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "horno";  
    } 
}
