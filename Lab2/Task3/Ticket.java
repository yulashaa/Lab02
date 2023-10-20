import java.util.ArrayList;
import java.util.List;

class Ticket {
    private List<String> flight1Tickets;

    public Ticket() {
        flight1Tickets = new ArrayList<>();
    }

    public void TicketForFlight1(String passenger) {
        flight1Tickets.add(passenger);
        System.out.println(passenger + "  gets his/her ticket.");
    }

    public void deleteTicketForFlight1(String passenger) {
        if (flight1Tickets.remove(passenger)) {
            System.out.println(passenger + " deleted from flight1.");
        } else {
            System.out.println("Ticket for " + passenger + " is enable.");
        }
    }
    public double calculateIncome(String period) {
        double income = 0.0;

        if (period.equalsIgnoreCase("day")) {
            income = flight1Tickets.size() * 10;
        } else if (period.equalsIgnoreCase("month")) {
            income = flight1Tickets.size() * 100;
        } else {
            System.out.println("Unknown period: " + period);
        }
        return income;
    }
}