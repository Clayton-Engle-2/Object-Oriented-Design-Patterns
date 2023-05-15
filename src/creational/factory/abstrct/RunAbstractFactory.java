package creational.factory.abstrct;

public class RunAbstractFactory {
    public void run(String[] args) {
        // Creating chocolate cupcake using the ChocolateCupcakeFactory
        CupcakeFactory chocolateFactory = new ChocolateCupcakeFactory();
        Cupcake chocolateCupcake = chocolateFactory.createCupcake();
        chocolateCupcake.prepare();
        chocolateCupcake.bake();
        
        // Creating vanilla cupcake using the VanillaCupcakeFactory
        CupcakeFactory vanillaFactory = new VanillaCupcakeFactory();
        Cupcake vanillaCupcake = vanillaFactory.createCupcake();
        vanillaCupcake.prepare();
        vanillaCupcake.bake();
        
        // Creating strawberry cupcake using the StrawberryCupcakeFactory
        CupcakeFactory strawberryFactory = new StrawberryCupcakeFactory();
        Cupcake strawberryCupcake = strawberryFactory.createCupcake();
        strawberryCupcake.prepare();
        strawberryCupcake.bake();
    }
}