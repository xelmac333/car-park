import java.util.ArrayList;
import java.util.List;

public class FleetManager {
    private List<Vehicle> cars = new ArrayList<>();

    public void addCar(Vehicle car) {
        cars.add(car);
    }


    public void showAvaibleCars() {
        int countCar = 0;
        for (Vehicle car : cars) {
            System.out.println(countCar + car.toString());
            countCar++;
        }
    }

    public void rentVehicle(int index, int hours) throws VehicleNotAvailableException {
        if (index < 0 || index >= cars.size()) {
            return;
        } else {
            Vehicle vehicle = cars.get(index);
            if (vehicle.isAvaible() == false) {
                throw new VehicleNotAvailableException("car" + vehicle.getModel() + " in another people");
            } else {
                vehicle.setAvaible(false);
                double cost = vehicle.calculateRentCost(hours);
                System.out.println("you got on arend a " + vehicle.getModel() + " on hours: " + hours + " TOTAL SUM = " + vehicle.calculateRentCost(hours));
            }
        }
    }

    public void returnVehicle(int index) {
        if (index < 0 | index >= cars.size()) {
            return;
        }else{
            Vehicle vehicle = cars.get(index);
            if(vehicle.isAvaible() == true){
                System.out.println("this car not in orend");
            }else{
                vehicle.setAvaible(true);
                System.out.println("a car " + vehicle.getModel() + "go to car park");
            }
        }
    }

    public List<Vehicle> getVehicles(){
        return cars;
    }
}
