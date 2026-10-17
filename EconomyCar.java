public class EconomyCar extends Vehicle{

    public EconomyCar(String brand, String model, double baseRate){
        super(brand,model,baseRate);
    }

    @Override
    public double calculateRentCost(int hours){
        return hours * getBaseRate();
    }
}
