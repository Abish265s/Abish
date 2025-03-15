import java.util.Scanner;
public class Toll{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vehicles to process: ");
        int numberOfVehicles = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i <numberOfVehicles;i++){
            System.out.println("\nProcessing vehicle"+(i+1)+":");
            System.out.print("Enter vehicle type (Car/Truck): ");
            String vehicleType = scanner.nextLine();
            System.out.print("Does the vehicle have an RFID pass? (yes/no): ");
            String hasRFID = scanner.nextLine();
            double tollFee = calculateTollFee(vehicleType, hasRFID.equalsIgnoreCase("yes"));
            System.out.println("Toll fee for the vehicle: ₹" + tollFee);
        }
        scanner.close();
    }
    public static double calculateTollFee(String vehicleType, boolean hasRFID) {
        double tollFee;
        if(vehicleType.equalsIgnoreCase("Car")) {
            tollFee = 100;
        }else if(vehicleType.equalsIgnoreCase("Truck")) {
            tollFee = 200;
        }else{
            System.out.println("Invalid vehicle type. Default toll fee set to ₹0.");
            return 0;
        }
        if(hasRFID){
            tollFee *=0.9; 
        }
        return tollFee;
    }
}
