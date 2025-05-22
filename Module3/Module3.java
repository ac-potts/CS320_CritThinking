import java.util.Scanner;

public class Module3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double weeklyIncome;
        double taxRate;
        double taxWithholdings;

        System.out.println("Enter your weekly income:");
        weeklyIncome = scnr.nextDouble();
        scnr.close();

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        taxWithholdings = weeklyIncome * taxRate;
        System.out.println("Weekly income: " + weeklyIncome);
        System.out.println("Tax rate: " + taxRate);
        System.out.println("Tax withholdings: " + taxWithholdings);
    }

}
