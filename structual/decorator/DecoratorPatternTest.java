package structual.decorator;

public class DecoratorPatternTest {
    public static void runTest() {
        // Create a base product
        Product product = new ConcreteProduct();

        // Now decorate it with gift wrap
        product = new GiftWrapDecorator(product);

        // Now add expedited shipping
        product = new ExpeditedShippingDecorator(product);

        System.out.println(product.getDescription() + " Cost: " + product.getCost());
    }
}
