package structual.decorator;

public class ExpeditedShippingDecorator extends ProductDecorator {
    public ExpeditedShippingDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public String getDescription() {
        return decoratedProduct.getDescription() + " + expedited shipping";
    }

    @Override
    public double getCost() {
        return decoratedProduct.getCost() + 10.00;
    }
}
