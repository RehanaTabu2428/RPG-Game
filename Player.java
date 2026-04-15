package com.rpg.characters;

public class Player extends Character {

    public Player(String name) {
        super(name, 100, 20);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " attacks!");
        target.takeDamage(attackPower);
    }
}
