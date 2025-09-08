package beverages_decorator;

public class Client {

    public static void main(String[] args) {
        
        System.out.println("=== Beverage Decorator Pattern Demo ===");
        System.out.println();

        // Basic beverages
        System.out.println("--- Basic Beverages ---");
        Beverage cappuccino = new Cappuccino();
        System.out.println("Cappuccino: $" + cappuccino.cost());

        Beverage latte = new Latte();
        System.out.println("Latte: $" + latte.cost());
        System.out.println();

        // Single decorators
        System.out.println("--- Single Add-ons ---");
        Beverage cappuccinoWithMilk = new MilkDecorator(new Cappuccino());
        System.out.println("Cappuccino + Milk: $" + cappuccinoWithMilk.cost());

        Beverage latteWithSugar = new SugarDecorator(new Latte());
        System.out.println("Latte + Sugar: $" + latteWithSugar.cost());
        System.out.println();

        // Multiple decorators
        System.out.println("--- Multiple Add-ons ---");
        Beverage fancyCappuccino = new WhippedCreamDecorator(
            new VanillaDecorator(
                new MilkDecorator(
                    new Cappuccino()
                )
            )
        );
        System.out.println("Cappuccino + Milk + Vanilla + Whipped Cream: $" + fancyCappuccino.cost());

        Beverage premiumLatte = new SugarDecorator(
            new VanillaDecorator(
                new MilkDecorator(
                    new Latte()
                )
            )
        );
        System.out.println("Latte + Milk + Vanilla + Sugar: $" + premiumLatte.cost());
        System.out.println();

        // All decorators on both beverages
        System.out.println("--- Premium Beverages (All Add-ons) ---");
        Beverage ultimateCappuccino = new SugarDecorator(
            new WhippedCreamDecorator(
                new VanillaDecorator(
                    new MilkDecorator(
                        new Cappuccino()
                    )
                )
            )
        );
        System.out.println("Ultimate Cappuccino: $" + ultimateCappuccino.cost());

        Beverage ultimateLatte = new SugarDecorator(
            new WhippedCreamDecorator(
                new VanillaDecorator(
                    new MilkDecorator(
                        new Latte()
                    )
                )
            )
        );
        System.out.println("Ultimate Latte: $" + ultimateLatte.cost());

        // Cost breakdown demonstration
        System.out.println();
        System.out.println("--- Cost Breakdown ---");
        System.out.println("Base Cappuccino: $10");
        System.out.println("+ Milk: $5");
        System.out.println("+ Vanilla: $6");
        System.out.println("+ Whipped Cream: $8");
        System.out.println("+ Sugar: $2");
        System.out.println("Total: $31 (matches Ultimate Cappuccino)");
    }
}
