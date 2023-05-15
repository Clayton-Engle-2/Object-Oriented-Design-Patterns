package creational.factory.abstrct;

public class ChocolateCupcakeFactory implements CupcakeFactory {
    @Override
    public Cupcake createCupcake() {
        return new ChocolateCupcake();
    }
}
