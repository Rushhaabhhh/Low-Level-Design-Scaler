package beverages_decorator;

public class WhippedCreamDecorator extends BeverageDecorator {
    private static final int WHIPPED_CREAM_COST = 8;

    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + WHIPPED_CREAM_COST;
    }

    public String getDescription() {
        return beverage.getClass().getSimpleName() + " + Whipped Cream";
    }
}
