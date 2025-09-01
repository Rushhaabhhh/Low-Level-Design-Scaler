public class GameCharacter {
    // Immutable fields
    private final String name;
    private final int age;
    private final int power;

    // Mutable fields
    private int level;
    private int health;

    // Constructor sets all fields initially
    public GameCharacter(String name, int age, int power, int level, int health) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.level = level;
        this.health = health;
    }

    // Immutable fields - only getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPower() {
        return power;
    }

    // Mutable fields - getters and setters
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    // Print current stats
    public void printStats() {
        System.out.println("Character: " + name);
        System.out.println("Age: " + age);
        System.out.println("Power: " + power);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
    }
}
