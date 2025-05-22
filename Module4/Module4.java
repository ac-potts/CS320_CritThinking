import java.util.Scanner;

public class Module4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        float userInput;
        float total = 0;
        float average = 0;
        float maximum = Float.NEGATIVE_INFINITY;
        float minimum = Float.POSITIVE_INFINITY;
        int counter = 0;

        while (counter < 5) {
            System.out.println("Enter a value:");
            userInput = scnr.nextFloat();
            scnr.close();
            if (userInput < 1) {
                System.out.println("Input must be > 0");
                continue;
            }

            total += userInput;
            if (userInput > maximum) {
                maximum = userInput;
            }
            if (userInput < minimum) {
                minimum = userInput;
            }
            counter++;
        }
        System.out.println("************");
        System.out.println("Total: " + total);
        average = total / 5;
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Interest: " + total * 0.2);

    }

}
