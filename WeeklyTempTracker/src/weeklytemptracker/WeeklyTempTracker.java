package weeklytemptracker;
import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTempTracker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> days = new ArrayList<>();
		ArrayList<Double> temperatures = new ArrayList<>();
		
		days.add("Monday"); temperatures.add(68.5);
		days.add("Tuesday"); temperatures.add(70.2);
		days.add("Wednesday"); temperatures.add(73.1);
		days.add("Thursday"); temperatures.add(71.4);
		days.add("Friday"); temperatures.add(69.8);
		days.add("Saturday"); temperatures.add(72.0);
		days.add("Sunday"); temperatures.add(70.5);
		
		System.out.print("Enter a day of the week or type 'week': ");
		String input = scanner.nextLine().trim();
		
		if (days.contains(input)) {
			int index = days.indexOf(input);
			System.out.println("Temperature for " + input + ": " + temperatures.get(index) + "°F");
		} else if (input.equals("week")) {
			double total = 0.0;
			System.out.println("\nWeekly Temperatures:");
			for (int i = 0; i < days.size(); i++) {
				System.out.println(days.get(i) + ": " + temperatures.get(i) + "°F");
				total += temperatures.get(i);
			}
			double average = total / temperatures.size();
			System.out.printf("\nWeekly Average: %.2f°F\n", average);
		} else {
			System.out.println("Invalid input. Please enter a valid day or 'week'.");
		}
		scanner.close();
	}

}
