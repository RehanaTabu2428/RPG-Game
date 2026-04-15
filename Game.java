package com.rpg.main;

import com.rpg.characters.*;
import com.rpg.combat.Battle;

public class Game {
    public static void main(String[] args) {

        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Goblin", 80, 15);

        Battle.fight(player, enemy);
    }
}
