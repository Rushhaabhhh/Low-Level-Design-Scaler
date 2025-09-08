package beverages_decorator;

public class MilkDecorator extends BeverageDecorator {
    private static final int MILK_COST = 5;

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + MILK_COST;
    }

    public String getDescription() {
        return beverage.getClass().getSimpleName() + " + Milk";
    }
}
