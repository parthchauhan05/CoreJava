public class A4Q1 {
    public static void main(String[] args) {
        Car micra = new Car("V4", "Auto", "Nissan", 12);
        micra.startEngine();
        micra.startMusicPlayer();
        micra.accelerate();
        micra.brake();
        Toyota camry = new Toyota("v6", "Auto", 25);
        camry.startEngine();
        camry.startMusicPlayer();
        Honda civic = new Honda("v6", "Auto", 55);
        civic.startEngine();
        civic.startMusicPlayer();
        Audi a4 = new Audi("v8", "Manual", 102);
        a4.startEngine();
        a4.startMusicPlayer();
    }
}

class Car {
    private String engine,  transmission;
    protected String make;
    private int speed, doors, wheels;

    public Car(String engine, String transmission, String make, int speed) {
        this.engine = engine;
        this.doors = 4;
        this.wheels = 4;
        this.transmission = transmission;
        this.make = make;
        this.speed = speed;
    }

    public Car() {
    }

    public void startEngine() {
        System.out.println("Engine Stared!");
    }

    public void accelerate () {
        System.out.println("Increasing Speed...");
    }

    public void brake() {
        System.out.println("Car is stopping soon!");
    }

    public void startMusicPlayer() {
        System.out.println("What you know about rollin' down in the deep?\n" +
                "When your brain goes numb, you can call that mental freeze");
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}

class Toyota extends Car {
    private static final int companyStartYear = 1996;

    public Toyota(String engine, String transmission, int speed) {
        super(engine, transmission, "Toyota", speed);
    }

    public void startMusicPlayer() {
        System.out.println("So they say\n" +
                "Dance for me, dance for me, dance for me, oh, oh, oh");
    }

    public void accelerate (int x) {
        System.out.println("Increasing Speed by "+ x + " kmph...");
    }

}

class Honda extends Car {
    private static final int companyStartYear = 1980;

    public Honda(String engine, String transmission,  int speed) {
        super(engine, transmission, "Honda", speed);
    }

    public void startMusicPlayer() {
        System.out.println("'Cause girls like you run 'round with guys like me\n" +
                "'Til sun down when I come through\n" +
                "I need a girl like you, yeah yeah");
    }

    public void accelerate (int x) {
        System.out.println("Increasing Speed by "+ x + " kmph...");
    }

}

class Audi extends Car {
    private static final int companyStartYear = 1964;

    public Audi(String engine, String transmission, int speed) {
        super(engine, transmission, "Audi", speed);
    }

    public void startMusicPlayer() {
        System.out.println("So, baby, pull me closer\n" +
                "In the back seat of your Rover");
    }
    public void accelerate (int x) {
        System.out.println("Increasing Speed by "+ x + " kmph...");
    }
}