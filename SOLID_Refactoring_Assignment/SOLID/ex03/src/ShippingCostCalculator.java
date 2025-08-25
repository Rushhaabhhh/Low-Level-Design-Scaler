public class ShippingCostCalculator {
    public double calculateCost(Shipment shipment) {
        ShippingStrategy strategy = ShippingStrategyFactory.getStrategy(shipment.getType());
        return strategy.calculateCost(shipment.getWeightKg());
    }
}
