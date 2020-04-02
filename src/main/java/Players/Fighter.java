package Players;

import Enemy.Enemy;
import Weapons.Sword;

public abstract class Fighter extends Player {

    private Sword sword;


    public Fighter(String name, int health, int purse, Sword sword) {
        super(name, health, purse);
        this.sword = sword;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(sword.getDamage());
    }
}