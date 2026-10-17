public abstract class Vehicle {
    private String brand;
    private String model;
    private double baseRate;
    private boolean isAvaible = true;

    public Vehicle(String brand, String model, double baseRate){
        this.brand = brand;
        this.model = model;
        this.baseRate = baseRate;
    }

    public abstract double calculateRentCost(int hours);

    public boolean isAvaible(){
        return isAvaible;
    }

    public void setAvaible(boolean avaible){
        isAvaible = avaible;
    }

    public String getModel(){
        return model;
    }

    public double getBaseRate(){
        return baseRate;
    }

    public String toString(){
        return " brand: " + brand + " | " + "model: " + model + " | " + "base rate: " + baseRate + " isavaible = " + isAvaible;
    }
}
