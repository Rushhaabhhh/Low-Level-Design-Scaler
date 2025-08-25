import java.util.HashMap;
import java.util.Map;

public class ShippingStrategyFactory {
    private static final Map<String, ShippingStrategy> strategies = new HashMap<>();
    
    static {
        registerStrategy(new StandardShippingStrategy());
        registerStrategy(new ExpressShippingStrategy());
        registerStrategy(new OvernightShippingStrategy());
    }
    
    public static void registerStrategy(ShippingStrategy strategy) {
        strategies.put(strategy.getShippingType(), strategy);
    }
    
    public static ShippingStrategy getStrategy(String shippingType) {
        ShippingStrategy strategy = strategies.get(shippingType);
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown shipping type: " + shippingType);
        }
        return strategy;
    }
}
