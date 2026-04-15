package com.rpg.characters;

public class Enemy extends Character {

    public Enemy(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " strikes back!");
        target.takeDamage(attackPower);
    }
}
