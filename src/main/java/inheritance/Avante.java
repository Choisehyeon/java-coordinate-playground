package inheritance;

public class Avante extends Car {

    public Avante(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }


    @Override
    String getName() {
        return "Avante";
    }
}
