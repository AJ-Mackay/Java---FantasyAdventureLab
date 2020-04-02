import Enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrollTest {

    private Troll troll;

    @Before
    public void before(){
        troll = new Troll(50);
    }

    @Test
    public void hasHealth(){
        assertEquals(50, troll.getHealth());
    }
}
