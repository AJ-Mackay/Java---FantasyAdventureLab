package Players;

import Weapons.Axe;
import Weapons.Sword;
import Weapons.Weapons;

public class Dwarf extends Fighter {


    public Dwarf(String name, int health, int purse, Sword sword, Axe axe, Weapons currentWeapon) {
        super(name, health, purse, sword, axe, currentWeapon);
    }


}
