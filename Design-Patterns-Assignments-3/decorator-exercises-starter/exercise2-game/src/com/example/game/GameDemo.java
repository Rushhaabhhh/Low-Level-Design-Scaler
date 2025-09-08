package com.example.game;

public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("=== Base Character ===");
        base.move();
        base.attack();
        System.out.println("Stats - Speed: " + base.getSpeed() + ", Damage: " + base.getDamage() + ", Sprite: " + base.getSprite());
        System.out.println();

        // a) Base + SpeedBoost + DamageBoost
        System.out.println("=== Base + Speed Boost + Damage Boost ===");
        Character buffed = new DamageBoost(new SpeedBoost(base, 3), 15);
        buffed.move();
        buffed.attack();
        System.out.println("Stats - Speed: " + buffed.getSpeed() + ", Damage: " + buffed.getDamage() + ", Sprite: " + buffed.getSprite());
        System.out.println();

        // b) Add GoldenAura (sprite change + buffs)
        System.out.println("=== Adding Golden Aura ===");
        Character shiny = new GoldenAura(buffed);
        shiny.move();
        shiny.attack();
        System.out.println("Stats - Speed: " + shiny.getSpeed() + ", Damage: " + shiny.getDamage() + ", Sprite: " + shiny.getSprite());
        System.out.println();

        // c) Remove GoldenAura by recomposition (rebuild chain without it)
        System.out.println("=== Removing Golden Aura (Recomposed) ===");
        Character withoutAura = buffed; // Reference to the buffed character without golden aura
        withoutAura.move();
        withoutAura.attack();
        System.out.println("Stats - Speed: " + withoutAura.getSpeed() + ", Damage: " + withoutAura.getDamage() + ", Sprite: " + withoutAura.getSprite());
        System.out.println();

        // Additional demonstration: Multiple golden auras for stacking
        System.out.println("=== Double Golden Aura Stack ===");
        Character doubleGolden = new GoldenAura(new GoldenAura(base));
        doubleGolden.move();
        doubleGolden.attack();
        System.out.println("Stats - Speed: " + doubleGolden.getSpeed() + ", Damage: " + doubleGolden.getDamage() + ", Sprite: " + doubleGolden.getSprite());
    }
}