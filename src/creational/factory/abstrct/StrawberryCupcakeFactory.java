package creational.factory.abstrct;

public class StrawberryCupcakeFactory implements CupcakeFactory {
    @Override
    public Cupcake createCupcake() {
        return new StrawberryCupcake();
    }
}
