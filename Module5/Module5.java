package Module5;

import java.util.Scanner;

public class Module5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] weeklyTemps = { 65, 71, 73, 70, 85, 82, 82 };
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        String userInput;
        int i;

        System.out.println("Enter a day of the week. Enter 'week' for all days:");
        userInput = scnr.next().trim();
        scnr.close();

        if (userInput.equalsIgnoreCase("week")) {
            for (i = 0; i < daysOfWeek.length; ++i) {
                System.out.println(daysOfWeek[i] + ": " + weeklyTemps[i]);
            }
        } else {
            for (i = 0; i < daysOfWeek.length; ++i) {
                if (daysOfWeek[i].equalsIgnoreCase(userInput)) {
                    System.out.println(daysOfWeek[i] + ": " + weeklyTemps[i]);
                    break;
                }
            }

        }

    }
}
