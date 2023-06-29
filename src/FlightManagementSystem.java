import java.util.ArrayList;
import java.util.List;

public class FlightManagementSystem {
    public static void main(String[] args) {
        FlightSystem flightSystem = new FlightSystem();

        // Uçuşları oluştur
        Flight flight1 = new Flight("TK123", "IST", "ANK", "10:00", 150);
        Flight flight2 = new Flight("TK456", "IST", "LON", "12:00", 200);
        Flight flight3 = new Flight("TK789", "IST", "PAR", "14:00", 180);

        // Uçuşları uçuş sistemine ekle
        flightSystem.addFlight(flight1);
        flightSystem.addFlight(flight2);
        flightSystem.addFlight(flight3);

        // Tüm uçuşları listele
        flightSystem.printFlightList();

        // Bir uçuşu kaldır
        flightSystem.removeFlight(flight2);

        // Güncellenmiş uçuş listesini yazdır
        System.out.println("Updated Flight List:");
        flightSystem.printFlightList();
    }
}

class Flight {
    private String flightNumber;
    private String departure;
    private String destination;
    private String departureTime;
    private int capacity;

    public Flight(String flightNumber, String departure, String destination, String departureTime, int capacity) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getCapacity() {
        return capacity;
    }
}

class FlightSystem {
    private List<Flight> flights;

    public FlightSystem() {
        flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    public void printFlightList() {
        for (Flight flight : flights) {
            System.out.println("Flight Number: " + flight.getFlightNumber());
            System.out.println("Departure: " + flight.getDeparture());
            System.out.println("Destination: " + flight.getDestination());
            System.out.println("Departure Time: " + flight.getDepartureTime());
            System.out.println("Capacity: " + flight.getCapacity());
            System.out.println("---------------------------");
        }
    }
}
