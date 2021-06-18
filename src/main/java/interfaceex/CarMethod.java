package interfaceex;

public interface CarMethod {

    double getDistancePerLitter();
    double getTripDistance();
    String getName();
    default double getChargeQuantity() {
        return getTripDistance()/getDistancePerLitter();
    }

}
