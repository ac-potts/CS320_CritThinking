package Module8.Automobile;

public class Automobile {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    public Automobile() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
        } catch (Exception e) {
            System.out.println("Error in default constructor: " + e.getMessage());
        }
    }

    public Automobile(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } catch (Exception e) {
            System.out.println("Error in parameterized constructor: " + e.getMessage());
        }
    }

    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle successfully added";
        } catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    public String[] listVehicle() {
        try {
            return new String[] {
                    "Make: " + make,
                    "Model: " + model,
                    "Color: " + color,
                    "Year: " + year,
                    "Mileage: " + mileage
            };
        } catch (Exception e) {
            return new String[] { "Failed to list vehicle: " + e.getMessage() };
        }
    }

    public String removeVehicle(String make, String model, String color, int year) {
        try {

            if (this.make.equalsIgnoreCase(make) &&
                    this.model.equalsIgnoreCase(model) &&
                    this.color.equalsIgnoreCase(color) &&
                    this.year == year) {

                this.make = "";
                this.model = "";
                this.color = "";
                this.year = 0;
                this.mileage = 0;

                return "Vehicle removed successfully.";
            } else {
                return "Vehicle details do not match. Removal failed.";
            }
        } catch (Exception e) {
            return "Error removing vehicle: " + e.getMessage();
        }

    }

    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully.";
        } catch (Exception e) {
            return "Failed to update vehicle: " + e.getMessage();
        }
    }
}
