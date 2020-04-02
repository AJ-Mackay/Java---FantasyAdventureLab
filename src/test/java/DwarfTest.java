import Enemy.Enemy;
import Enemy.Troll;
import Players.Dwarf;
import Weapons.Axe;
import Weapons.Sword;
import Weapons.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Weapons currentWeapon;

    @Before
    public void before(){
        Sword sword = new Sword(10, "Sword");
        Axe axe = new Axe(5, "Axe");

        dwarf = new Dwarf("Zsolt", 100, 20, sword, axe, currentWeapon);
    }

    @Test
    public void hasName(){
        assertEquals("Zsolt", dwarf.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void hasPurse(){
        assertEquals(20, dwarf.getPurse());
    }

    @Test
    public void canDecreaseHeath(){
        dwarf.takeDamage(10);
        assertEquals(90, dwarf.getHealth());
    }

    @Test
    public void canIncreaseHealth(){
        dwarf.takeDamage(20);
        dwarf.healed(10);
        assertEquals(90, dwarf.getHealth());
    }

    @Test
    public void canDecreasePurse(){
        dwarf.decreasePurse(10);
        assertEquals(10, dwarf.getPurse());
    }

    @Test
    public void canIncreasePurse(){
        dwarf.increasePurse(10);
        assertEquals(30, dwarf.getPurse());
    }

    @Test
    public void attack(){
        Enemy enemy = new Troll(50);
        dwarf.attack(enemy);
        assertEquals(40, enemy.getHealth());
    }

    @Test
    public void getWeapon(){
        dwarf.changeCurrentWeapon();
        assertEquals("Axe", dwarf.getCurrentWeapon().getName());
    }



}
