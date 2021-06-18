package inheritance;

import java.util.ArrayList;

public class RentCompany {

    ArrayList<Car> carList;

    public RentCompany() {
        carList = new ArrayList<Car>();
    }
    public static RentCompany create() {
        return new RentCompany();
    }

    public String generateReport() {

        String answer = "";
        for(Car car : carList)
             answer += car.getName() + " : " + (int)car.getChargeQuantity() + "리터\n";
        return answer;
    }

    public void addCar(Car car) {
        if("Avante".equalsIgnoreCase(car.getName())){
            carList.add(new Avante(car.distance));
        }
        if("K5".equalsIgnoreCase(car.getName())) {
            carList.add(new K5(car.distance));
        }
        if("Sonata".equalsIgnoreCase(car.getName())) {
            carList.add(new Sonata(car.distance));
        }
    }
}
