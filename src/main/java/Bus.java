import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if(this.capacity >= 1){
        this.passengers.add(person);
        this.capacity -= 1;
        }
    }

    public void removePassenger(Person person) {
            this.passengers.remove(person);
            this.capacity -= 1;
    }

    public void addPassengerFromBusStop(BusStop busStop) {
        Person person = busStop.removeFromQueue();
        this.addPassenger(person);
    }
}
