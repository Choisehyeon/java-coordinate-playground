package interfaceex;

public abstract class Car implements CarMethod {

    protected int distance;

    @Override
    public double getDistancePerLitter() {
        return 0;
    }

    @Override
    public double getTripDistance() {
        return this.distance;
    }

}
