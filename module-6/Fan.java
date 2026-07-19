// cschumacher_07192026_mod6_2_csd402
// https://github.com/LittleIowaBoy/csd-402/tree/main

public class Fan {

    // Speed constants
    public static final int STOPPED = 0;
    public static final int SLOW    = 1;
    public static final int MEDIUM  = 2;
    public static final int FAST    = 3;

    // Fields with default values
    private int    speed  = STOPPED;
    private boolean on    = false;
    private double radius = 6;
    private String color  = "white";

    // No-argument constructor, so all fields remain at their defaults
    public Fan() {
    }

    // Argument constructor which sets all fields to supplied values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed  = speed;
        this.on     = on;
        this.radius = radius;
        this.color  = color;
    }

    //  Getters

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    //  Setters 

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Returns a description of the fan's current state
    @Override
    public String toString() {
        String speedLabel;
        switch (speed) {
            case SLOW:   speedLabel = "slow";    break;
            case MEDIUM: speedLabel = "medium";  break;
            case FAST:   speedLabel = "fast";    break;
            default:     speedLabel = "stopped"; break;
        }
        if (on) {
            return "Fan [color=" + color + ", radius=" + radius
                 + ", speed=" + speedLabel + ", on=true]";
        } else {
            return "Fan [color=" + color + ", radius=" + radius
                 + ", on=false]";
        }
    }

    //  Test code
    public static void main(String[] args) {

        // Fan 1: created with the no-argument constructor
        Fan fan1 = new Fan();
        System.out.println("=== Fan 1 (default constructor) ===");
        System.out.println(fan1);

        // Exercise setters on fan1
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("blue");
        System.out.println("\n--- Fan 1 after setters ---");
        System.out.println(fan1);

        // Exercise getters on fan1
        System.out.println("\n--- Fan 1 getter values ---");
        System.out.println("  Speed  : " + fan1.getSpeed());
        System.out.println("  On     : " + fan1.isOn());
        System.out.println("  Radius : " + fan1.getRadius());
        System.out.println("  Color  : " + fan1.getColor());

        // Fan 2: created with the argument constructor
        Fan fan2 = new Fan(FAST, true, 5, "black");
        System.out.println("\n=== Fan 2 (argument constructor) ===");
        System.out.println(fan2);

        // Exercise setters on fan2
        fan2.setSpeed(SLOW);
        fan2.setOn(false);
        System.out.println("\n--- Fan 2 after setters ---");
        System.out.println(fan2);
    }
}
