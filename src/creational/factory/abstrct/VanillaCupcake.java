package creational.factory.abstrct;

public class VanillaCupcake implements Cupcake {
    @Override
    public void prepare() {
        System.out.println("Preparing ingredients for vanilla cupcake...");
    }
    
    @Override
    public void bake() {
        System.out.println("Baking a fluffy vanilla cupcake...");
    }
}
