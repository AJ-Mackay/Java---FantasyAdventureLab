import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    private Sword sword;

    @Before
    public void before(){
        Sword sword = new Sword(10, "sword");
    }

//    @Test
//    public void canPickUp(){
//        sword.pickUp();
//
//        assertEquals("I picked up this sword", sword.pickUp());
//    }
}
