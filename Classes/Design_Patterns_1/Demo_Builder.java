public class Demo_Builder {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter("Thor", 1000, 5000, 1, 100);

        hero.printStats();

        // Simulate leveling up and health change
        hero.setLevel(4);
        hero.setHealth(80);

        System.out.println("\nAfter level up and damage:");
        hero.printStats();

        // Immutable fields remain same, mutable updated
    }
}
