
package polimorfismo;


public class Gallo extends Ave {
    public void makeSound(){
        System.out.println("Kikiriki...");
    }

    @Override
    public void move() {
        System.out.println("En dos patas");
    }
    
}
