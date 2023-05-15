package creational.factory.abstrct;

public class ChocolateCupcake implements Cupcake {
    @Override
    public void prepare() {
        System.out.println("Preparing ingredients for chocolate cupcake...");
    }
    
    @Override
    public void bake() {
        System.out.println("Baking a moist chocolate cupcake...");
    }
}
