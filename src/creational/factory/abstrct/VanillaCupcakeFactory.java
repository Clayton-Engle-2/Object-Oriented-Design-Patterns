package creational.factory.abstrct;

public class VanillaCupcakeFactory implements CupcakeFactory {
    @Override
    public Cupcake createCupcake() {
        return new VanillaCupcake();
    }
}