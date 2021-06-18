package interfaceex;

public class Avante extends Car {

    public Avante(int distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLitter() {
        return 15;
    }

    @Override
    public String getName() {
        return "Avante";
    }

}
