package car;

public class Avante extends Car{

    private static final int PER_LITER = 15;
    private static final String NAME = "AVANTE";

    private int distance;

    public Avante(int distance) {
        this.distance = distance;
    }

    @Override
    public double distancePerLiter() {
        return PER_LITER * this.getDistance();
    }

    @Override
    double getDistance() {
        return this.getDistance();
    }

    @Override
    public String getName() {
        return NAME;
    }
}
