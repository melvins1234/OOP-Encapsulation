public class Bike {
    private String bikeName;
    private String owner;
    private int speed;
    private String color;

    public Bike(String bikeName, String owner, int speed, String color) {
        this.bikeName = bikeName;
        this.owner = owner;
        this.speed = speed;
        this.color = color;
    }

    public Bike(){}

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
