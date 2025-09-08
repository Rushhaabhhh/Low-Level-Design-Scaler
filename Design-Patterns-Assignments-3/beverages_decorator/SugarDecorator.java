package beverages_decorator;

public class SugarDecorator extends BeverageDecorator {
    private static final int SUGAR_COST = 2;

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + SUGAR_COST;
    }

    public String getDescription() {
        return beverage.getClass().getSimpleName() + " + Sugar";
    }
}
