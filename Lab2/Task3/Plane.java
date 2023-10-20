public class Plane {
    private String name;
    private int capacity;
    private int speed;

    public Plane(String name, int capacity, int speed) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getInfo() {
        return  "Name: " + name + ", capacity: " + capacity + ", speed " + speed;
    }

    public void editPlane(String name, int capacity, int speed) {
        this.setName(name);
        this.setCapacity(capacity);
        this.setSpeed(speed);
    }
    public void deletePlaneInfo() {
        this.name = null;
        this.capacity = 0;
        this.speed = 0;
    }
}

