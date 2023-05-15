package creational.factory.factory;

public class CakeFactory {
    public static Cake createCake(String type) {
        switch (type.toLowerCase()) {
            case "chocolate":
                return new ChocolateCake();
            case "strawberry":
                return new StrawberryCake();
            case "vanilla":
                return new VanillaCake();
            default:
                throw new IllegalArgumentException("Invalid cake type: " + type);
        }
    }
}
