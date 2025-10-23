
package polimorfismo;


public class Perro extends Canino {
    public void makeSound(){
        System.out.println("Guau...");
    }

    @Override
    public void move() {
        System.out.println("En cuatro patas");
    }
    
}
