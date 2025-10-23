
package polimorfismo;


public class Lobo extends Canino {
    public void makeSound(){
        System.out.println("Auuu...");
    }

    @Override
    public void move() {
        System.out.println("Camina en 4 patas");
    }
    
}
