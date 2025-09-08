package beverages_decorator;

public class VanillaDecorator extends BeverageDecorator {
    private static final int VANILLA_COST = 6;

    public VanillaDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + VANILLA_COST;
    }

    public String getDescription() {
        return beverage.getClass().getSimpleName() + " + Vanilla";
    }
}
