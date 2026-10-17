public class BusinessCar extends Vehicle{
    private boolean hasDriver;

    public BusinessCar(String brand, String model, double baseRate, boolean hasDriver){
        super(brand,model,baseRate);
        this.hasDriver = hasDriver;
    }

    @Override
    public double calculateRentCost(int hours){
        return hours * getBaseRate() + 200;
    }
}
