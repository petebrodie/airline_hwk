import java.util.ArrayList;


public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String FlightNumber;
    private String Destination;
    private String DepartureAirport;
    private String DepartureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.FlightNumber = flightNumber;
        this.Destination = destination;
        this.DepartureAirport = departureAirport;
        this.DepartureTime = departureTime;



    }


}


