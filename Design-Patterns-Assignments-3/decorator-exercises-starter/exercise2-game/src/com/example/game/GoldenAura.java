package com.example.game;

public class GoldenAura extends CharacterDecorator {
    private final int speedBuff = 2;
    private final int damageBuff = 5;

    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public void move() {
        System.out.println("✨ Golden aura shimmers ✨");
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite() + " [GOLDEN AURA GLOWING]");
    }

    @Override
    public void attack() {
        System.out.println("✨ Golden power surges through the attack ✨");
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite() + " [GOLDEN AURA BLAZING]");
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + speedBuff;
    }

    @Override
    public int getDamage() {
        return character.getDamage() + damageBuff;
    }

    @Override
    public String getSprite() {
        return "golden_" + character.getSprite();
    }
}
