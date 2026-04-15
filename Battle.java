package com.rpg.combat;

import com.rpg.characters.*;

public class Battle {

    public static void fight(Player player, Enemy enemy) {

        while (player.isAlive() && enemy.isAlive()) {

            player.attack(enemy);

            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }

        if (player.isAlive()) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Enemy wins!");
        }
    }
}
