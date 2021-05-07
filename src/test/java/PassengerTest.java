import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Bag bag;


    @Before
    public void setUp() {
        passenger = new Passenger("Pete");
        bag = new Bag();
    }

    @Test
    public void getName() {
        assertEquals("Pete", passenger.getName());
    }

    @Test
    public void canAddBag() {
        passenger.addBag(bag);
        assertEquals(1, passenger.bagCount());
    }

    @Test
    public void getTotalWeightOfLuggageTest() {
        Bag bag1 = new Bag();
        Bag bag2 = new Bag();
        passenger.addBag(bag);
        passenger.addBag(bag1);
        passenger.addBag(bag2);
        assertEquals(3, passenger.bagCount());
        assertEquals(30, passenger.getTotalWeightOfLuggage());
    }





}
