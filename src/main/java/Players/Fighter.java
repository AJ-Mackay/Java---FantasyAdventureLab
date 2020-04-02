package Players;

import Enemy.Enemy;
import Weapons.Axe;
import Weapons.Sword;
import Weapons.Weapons;

public abstract class Fighter extends Player {

    private Sword sword;
    private Axe axe;
    private Weapons currentWeapon;


    public Fighter(String name, int health, int purse, Sword sword, Axe axe, Weapons currentWeapon) {
        super(name, health, purse);
        this.sword = sword;
        this.axe = axe;
        this.currentWeapon = sword;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(sword.getDamage());
    }

    public Weapons getCurrentWeapon() {
        return currentWeapon;
    }

    public void changeCurrentWeapon() {
        if(currentWeapon == sword ){
            currentWeapon = axe;
        } else if (currentWeapon == axe){
            currentWeapon = sword;

        }
    }




}