public class Airport {
    private int airportCode;
    private String name;

    public Airport(int airportCode, String name) {
        this.airportCode = airportCode;
        this.name = name;
    }
    public String getInfo() {
        return "Airport code: " + airportCode + "; name: " + name;
    }
    public void editAirport(int airportCode, String name) {
        this.airportCode = airportCode;
        this.name = name;
    }

    public void deleteAirport() {
        this.airportCode = 0;
        this.name = null;
    }

}
