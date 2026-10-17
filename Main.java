import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FleetManager manager = new FleetManager();
        manager.addCar(new EconomyCar("RENO", "SCENIC", 5000.0));
        manager.addCar(new EconomyCar("NISAN", "LEAF", 6000.0));
        manager.addCar(new BusinessCar("BMW", "X5", 10000.0, true));
        manager.addCar(new CargoTruck("WOLFZWAGEN", "TRANSPORTER", 15000.0, 3000.0));
        while(true){
            System.out.println("1 - show all car");
            System.out.println("2 - rent a car");
            System.out.println("3 - return a car");
            System.out.println("4 - add new car in park");
            System.out.println("5 - exit");
            boolean isValidInput = false;
            int choice = 0;
            while(!isValidInput) {
                try {
                    choice = scanner.nextInt();
                    isValidInput = true;
                } catch (InputMismatchException e){
                    System.out.println("enter not a word,please");
                    scanner.nextLine();
                }
            }
            switch (choice){
                case 1:
                    manager.showAvaibleCars();
                    break;
                case 2:
                    boolean isValidInput1 = false;
                    int rentChUser = 0;
                    int hoursUser = 0;
                    while(!isValidInput1) {
                        try {
                            System.out.println("enter index of car what you want");
                            rentChUser = scanner.nextInt();
                            System.out.println("enter a time what you want a rent a car");
                            hoursUser = scanner.nextInt();
                            isValidInput1 = true;
                        } catch (InputMismatchException e){
                            System.out.println("enter not a word,please");
                            scanner.nextLine();
                        }
                    }
                    try{
                        manager.rentVehicle(rentChUser, hoursUser);
                    } catch (VehicleNotAvailableException e) {
                        System.out.println("please rent another car");
                    }
                    break;
                case 3:
                    boolean isValidInput2 = false;
                    int indexReturn = 0;
                    while(!isValidInput2) {
                        try {
                            System.out.println("enter index of car what you want return");
                            indexReturn = scanner.nextInt();
                            isValidInput2 = true;
                        } catch (InputMismatchException e){
                            System.out.println("enter not a word,please");
                            scanner.nextLine();
                        }
                    }
                    manager.returnVehicle(indexReturn);
                    break;
                case 4:
                    String userBrand = null;
                    String userModel = null;
                    double userBaseRate = 0.0;
                    boolean isValidInput3 = false;
                    while(!isValidInput3) {
                        try {
                            scanner.nextLine();
                            System.out.println("you have permision to add only economy car");
                            System.out.println("enter a brand of your car");
                            userBrand = scanner.nextLine();
                            System.out.println("enter a model of your car");
                            userModel = scanner.nextLine();
                            System.out.println("enter a base rate of your car");
                            userBaseRate = scanner.nextDouble();
                            scanner.nextLine();
                            isValidInput3 = true;
                        } catch (InputMismatchException e){
                            System.out.println("enter not a word,please");
                            scanner.nextLine();
                        }
                    }
                    manager.addCar(new EconomyCar(userBrand,userModel,userBaseRate));
                    break;
                case 5:
                    System.out.println("close a program,please wait a second");
                    System.exit(0);
                    break;
                default:
                    return;
            }
        }
    }
}

