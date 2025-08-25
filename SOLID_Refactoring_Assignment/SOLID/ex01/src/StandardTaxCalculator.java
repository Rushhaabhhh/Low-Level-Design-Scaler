public class StandardTaxCalculator implements TaxCalculator {
    private final double taxRate = 0.18;
    
    @Override
    public double calculateTotalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}