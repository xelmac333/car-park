public class CargoTruck extends Vehicle implements Maintaible{
    private double maxLoadCapacity;

    public CargoTruck(String brand, String model, double baseRate, double maxLoadCapacity){
        super(brand,model,baseRate);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public double calculateRentCost(int hours){
        if(maxLoadCapacity > 5000.0){
            return hours * getBaseRate() + 500;
        }else{
            return hours * getBaseRate();
        }
    }

    public void performService(){
        System.out.println("a cargo is perfecrly going a crashtest");
    }
}
