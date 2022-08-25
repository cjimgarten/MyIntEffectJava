package car;

public class SportsCar extends Car {

    private int horsePower;

    public SportsCar(String make, String model, String color, int numSeats, int horsePower) {
        super(make, model, color, numSeats);
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "SportsCar:{make:"+super.getMake()+", model:"+super.getModel()+", color:"+super.getColor()+
                ", numSeats:"+super.getNumSeats()+", horsePower:"+horsePower+"}";
    }
}
