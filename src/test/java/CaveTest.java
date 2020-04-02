import Enemy.Enemy;
import Players.Dwarf;
import Rooms.Cave;
import Weapons.Axe;
import Weapons.Sword;
import Weapons.Weapons;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;
import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaveTest {
    
    private Cave cave;
    private Dwarf dwarf;
    private Sword sword;
    private Axe axe;
    private Weapons currentWeapon;

    @Before
    public void before(){
        cave = new Cave("Cave", 100);
        dwarf = new Dwarf("Zsolt", 100, 20, sword, axe, currentWeapon);
    }
    
    @Test
    public void canTakeCoins(){
        cave.takeCoins(100, dwarf);
        assertEquals(120 ,dwarf.getPurse());
    }
}
