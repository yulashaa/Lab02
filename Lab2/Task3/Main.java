import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Boeing", 250, 500);
        Plane plane2 = new Plane("Airflight", 180, 320);

        Flight flight = new Flight(12, "Kyiv", "Krakow", plane2, "22/10/2023 13:00", "22/10/2023 14:30");
        Flight flight1 = new Flight(10, "Kyiv", "Mykolaiv", plane2, "22/10/2023 13:00", "22/10/2023 13:30");

        Airport airport = new Airport(2022, "KYIV Airport");

        Passenger passenger = new Passenger(01, "Yulia");

        Ticket ticket = new Ticket();

        System.out.println("Information about plane:");
        System.out.println(plane1.getInfo());

        plane1.editPlane("Airbus", 246, 550);
        System.out.println("After editing the information:");
        System.out.println(plane1.getInfo());

        System.out.println("Information about flight:");
        System.out.println(flight.getInfo());

        flight.editFlight("Krakow", "Kyiv", plane1, "22/10/2023 14:30", "22/10/2023 13:00");
        System.out.println("After editing the information:");
        System.out.println(flight.getInfo());

        System.out.println(airport.getInfo());
        System.out.println("Information about airport:");
        System.out.println(airport.getInfo());

        airport.editAirport(100, "ODESSA  Airport");
        System.out.println("After editing the information:");

        System.out.println("Information about passenger:");
        System.out.println(passenger.getInfo());

        passenger.setName("Natalia");
        System.out.println("After editing the information:");
        System.out.println(passenger.getInfo());

        FlightsList schedule = new FlightsList();
        schedule.addFlight(flight);
        schedule.addFlight(flight1);

        schedule.displaySchedule();

        ticket.TicketForFlight1("Passanger 1");
        ticket.deleteTicketForFlight1("Passanger 1");
        ticket.deleteTicketForFlight1("Passanger 2");

        double dailyIncome = ticket.calculateIncome("day");
        System.out.println("Income per day: " + dailyIncome);

        double monthlyIncome = ticket.calculateIncome("month");
        System.out.println("Income per month: " + monthlyIncome);

        plane1.deletePlaneInfo();
        System.out.println("After deleting information about plane:");
        System.out.println(plane1.getInfo());

        airport.deleteAirport();
        System.out.println("After deleting information about airport:");
        System.out.println(airport.getInfo());

        flight.deleteFlight();
        System.out.println("After deleting information about flight:");
        System.out.println(flight.getInfo());

        passenger.deletePassenger();
        System.out.println("After deleting information about passenger:");
        System.out.println(passenger.getInfo());


    }
}
