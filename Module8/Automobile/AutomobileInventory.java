package Module8.Automobile;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AutomobileInventory {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        try {
            Automobile vehicle = new Automobile("Toyota", "Sienna", "Black", 2024, 7000);

            String[] vehicleDesc = vehicle.listVehicle();

            for (int i = 0; i < vehicleDesc.length; ++i) {
                System.out.println(vehicleDesc[i]);
            }

            System.out.println(vehicle.removeVehicle("Toyota", "Sienna", "Black", 2024));

            System.out.println(vehicle.addVehicle("Ford", "Mustang", "Blue", 2025, 75));

            vehicleDesc = vehicle.listVehicle();

            for (int i = 0; i < vehicle.listVehicle().length; ++i) {
                System.out.println(vehicleDesc[i]);
            }

            // 5. Update vehicle
            vehicle.updateVehicle("Honda", "Odyssey", "Silver", 2019, 65000);
            vehicleDesc = vehicle.listVehicle();
            for (int i = 0; i < vehicle.listVehicle().length; ++i) {
                System.out.println(vehicleDesc[i]);
            }

            // 6.
            System.out.println("Do you want to output a file (Y/N)?");
            userInput = scnr.next();
            scnr.close();

            if (userInput.equals("Y")) {
                System.out.println("Information will be printed to a file");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("automobile.txt"))) {
                    for (String line : vehicleDesc) {
                        writer.write(line);
                        writer.newLine();
                    }
                    System.out.println("Array written to file successfully.");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e.getMessage());
                }
            } else {
                System.out.println("No file will be printed.");
            }

        } catch (Exception e) {
            System.out.println("Vehicle not created.");
        }
    }
}
