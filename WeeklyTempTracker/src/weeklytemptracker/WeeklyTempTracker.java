package weeklytemptracker;
import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTempTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // Pre-load the list of days 
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Prompt User
        System.out.print("Enter a day of the week (e.g., Monday) to see temperature, or type \"week\" to enter data for the full week: ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("week")) {
            // Collect temperatures for the full week
            for (String day : weekDays) {
                System.out.print("Enter average temperature for " + day + ": ");
                double temp = Double.parseDouble(input.nextLine());
                days.add(day);
                temperatures.add(temp);
            }

            // Display summary
            double total = 0;
            System.out.println("\nTemperatures for the week:");
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i) + "°F");
                total += temperatures.get(i);
            }
            double average = total / temperatures.size();
            System.out.printf("Weekly average temperature: %.2f°F\n", average);

        } else {
            // Only prompt for that day's temperature
            boolean isValidDay = false;
            for (String day : weekDays) {
                if (day.equalsIgnoreCase(choice)) {
                    System.out.print("Enter temperature for " + day + ": ");
                    double temp = Double.parseDouble(input.nextLine());
                    System.out.println(day + ": " + temp + "°F");
                    isValidDay = true;
                    break;
                }
            }
            if (!isValidDay) {
                System.out.println("Invalid day. Please restart and enter a valid day name.");
            }
        }
        input.close();
    }
}