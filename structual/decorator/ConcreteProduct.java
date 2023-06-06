package structual.decorator;

public class ConcreteProduct implements Product {
    @Override
    public String getDescription() {
        return "Base Product";
    }

    @Override
    public double getCost() {
        return 20.00;
    }
}
