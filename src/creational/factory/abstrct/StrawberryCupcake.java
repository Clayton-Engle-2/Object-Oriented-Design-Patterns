package creational.factory.abstrct;

public class StrawberryCupcake implements Cupcake {
    @Override
    public void prepare() {
        System.out.println("Preparing ingredients for strawberry cupcake...");
    }
    
    @Override
    public void bake() {
        System.out.println("Baking a fruity strawberry cupcake...");
    }
}
