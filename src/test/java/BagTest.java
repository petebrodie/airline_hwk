import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagTest {

    Bag bag;

    @Before
    public void setUp() {
        bag = new Bag();
    }

    @Test
    public void canGetWeight() {
        assertEquals(10, bag.getWeight());
    }


}
