import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Soutside", 5);
        person = new Person();
//        busStop.addToQueue(person);
//        busStop.addToQueue(person);
    }

    @Test
    public void getTotalPassengers() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void addPassengerFromBusStop(){

        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.passengerCount());
    }


}
