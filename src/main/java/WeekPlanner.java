import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[1][0] = "Monday";
        schedule[2][0] = "Tuesday";
        schedule[3][0] = "Wednesday";
        schedule[4][0] = "Thursday";
        schedule[5][0] = "Friday";
        schedule[6][0] = "Saturday";
        schedule[0][1] = "Go to the lesson; Do the tests.";
        schedule[1][1] = "Work; Start your homework.";
        schedule[2][1] = "Work; Finish your homework.";
        schedule[3][1] = "Work; Do your workout.";
        schedule[4][1] = "Go to the lesson; Do the tests.";
        schedule[5][1] = "Work; Start and finish your homework.";
        schedule[6][1] = "Rest; Do your workout.";

        System.out.println("If you want to exit just type \"exit\".");

        while(true) {

            System.out.print("Please, input the day of the week:");

            int breaker = 0;

            String input = scanner.nextLine();
            input = input.toLowerCase().trim();

            if(input.equals("exit")) break;

            for(int i = 0; i < 7; i++) {
                if (input.equals("change " + schedule[i][0].toLowerCase()) || input.equals("reschedule " + schedule[i][0].toLowerCase())) {
                    System.out.print("Please, input new tasks for " + schedule[i][0] + ":");
                    String change = scanner.nextLine();
                    schedule[i][1] = change;
                    breaker++;
                }
            }
            if(breaker == 1) continue;

            switch (input) {
                case "sunday" -> System.out.println("Your tasks for " + schedule[0][0] + ": " + schedule[0][1]);
                case "monday" -> System.out.println("Your tasks for " + schedule[1][0] + ": " + schedule[1][1]);
                case "tuesday" -> System.out.println("Your tasks for " + schedule[2][0] + ": " + schedule[2][1]);
                case "wednesday" -> System.out.println("Your tasks for " + schedule[3][0] + ": " + schedule[3][1]);
                case "thursday" -> System.out.println("Your tasks for " + schedule[4][0] + ": " + schedule[4][1]);
                case "friday" -> System.out.println("Your tasks for " + schedule[5][0] + ": " + schedule[5][1]);
                case "saturday" -> System.out.println("Your tasks for " + schedule[6][0] + ": " + schedule[6][1]);
                default -> System.out.println("Sorry, I don't understand you, try again.");
            }
        }
    }
}
