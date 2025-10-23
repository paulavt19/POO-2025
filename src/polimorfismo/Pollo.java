
package polimorfismo;


public class Pollo extends Ave {
    public void makeSound(){
        System.out.println("Pio...");
    }

    @Override
    public void move() {
        System.out.println("En dos patas");
    }
    
}
