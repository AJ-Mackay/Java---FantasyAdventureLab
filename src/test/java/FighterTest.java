import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    private Fighter fighter;

    @Before
    public void before(){
        fighter = new Fighter("Zsolt", 100, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Zsolt", fighter.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, fighter.getHealth());
    }

    @Test
    public void hasPurse(){
        assertEquals(20, fighter.getPurse());
    }

    @Test
    public void canDecreaseHeath(){
        fighter.setHealthReduced(10);
        assertEquals(90, fighter.getHealth());
    }

    @Test
    public void canIncreaseHealth(){
        fighter.setHealthReduced(20);
        fighter.healed(10);
        assertEquals(90, fighter.getHealth());
    }

    @Test
    public void canDecreasePurse(){
        fighter.decreasePurse(10);
        assertEquals(10, fighter.getPurse());
    }

    @Test
    public void canIncreasePurse(){
        fighter.increasePurse(10);
        assertEquals(30, fighter.getPurse());
    }



}
