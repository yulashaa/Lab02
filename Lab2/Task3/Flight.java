public class Flight {
    final int id;
    private String departurePoint;
    private String arrivalPoint;
    private Plane plane;
    private String departureTime;
    private String arrivalTime;

    public Flight(int id, String departurePoint, String arrivalPoint, Plane plane, String departureTime, String arrivalTime) {
        this.id = id;
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.plane = plane;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public int getId() {
        return id;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getInfo() {
        return "Flight ID: " + id + "; departure point: " + departurePoint + "; arrival point: " + arrivalPoint
                + "; plane: " + plane.getInfo() + "; departure time: " + departureTime + "; arrival time: " + arrivalTime;
    }

    public void editFlight(String departurePoint, String arrivalPoint, Plane plane, String departureTime, String arrivalTime) {
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.plane = plane;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public void deleteFlight() {
        this.departurePoint = null;
        this.arrivalPoint = null;
        this.plane = null;
        this.departureTime = null;
        this.arrivalTime = null;
    }
}