public class Passenger {
    private final int passengerID;
    private String name;

    public Passenger(int passengerID, String name) {
        this.passengerID = passengerID;
        this.name = name;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Passenger ID: " + passengerID + "; name: " + name;
    }

    public void deletePassenger() {
        this.name = null;
    }
}
