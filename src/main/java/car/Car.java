package car;

public class Car {

    private String make;
    private String model;
    private String color;
    private int numSeats;

    public Car(String make, String model, String color, int numSeats) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.numSeats = numSeats;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public String toString() {
        return "Car:{make:"+make+", model:"+model+", color:"+color+", numSeats:"+numSeats+"}";
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car("Honda","Accord","black",4);
        System.out.println(c);
        Car sc = new SportsCar("Chevy","Corvette","yellow",2,100);
        System.out.println(sc);
    }
}
