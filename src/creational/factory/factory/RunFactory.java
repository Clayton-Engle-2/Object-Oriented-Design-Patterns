package creational.factory.factory;

public class RunFactory {
    public void run(String[] args) {
        // Creating cakes using the CakeFactory
        Cake chocolateCake = CakeFactory.createCake("chocolate");
        chocolateCake.bake();
        
        Cake strawberryCake = CakeFactory.createCake("strawberry");
        strawberryCake.bake();
        
        Cake vanillaCake = CakeFactory.createCake("vanilla");
        vanillaCake.bake();
        
        // Creating an invalid cake type
        try {
            Cake invalidCake = CakeFactory.createCake("lemon");
            invalidCake.bake();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
