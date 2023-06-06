package structual.decorator;

public class GiftWrapDecorator extends ProductDecorator {
    public GiftWrapDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public String getDescription() {
        return decoratedProduct.getDescription() + " + gift wrap";
    }

    @Override
    public double getCost() {
        return decoratedProduct.getCost() + 5.00;
    }
}