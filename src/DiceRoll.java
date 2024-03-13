import java.util.Random; // Importing Random class from java.util package
import java.util.Scanner; // Importing Scanner class from java.util package

public class DiceRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input
        Random random = new Random(); // Creating Random object for generating random numbers

        int minVal = 1; // Minimum value of the dice
        int maxVal = 6; // Maximum value of the dice
        String rollAgain = "yes"; // Initialize rollAgain variable

        while (rollAgain.equals("yes") || rollAgain.equals("y")) { // while loop with condition
            System.out.println("Rolling the Dice. . .");
            System.out.println("Values are: ");
            System.out.println(random.nextInt(maxVal - minVal + 1) + minVal); // Generating random number within specified range
            System.out.println(random.nextInt(maxVal - minVal + 1) + minVal); // Generating another random number

            System.out.println("You wanna roll again?");
            rollAgain = input.nextLine().toLowerCase(); // Taking user input and converting to lowercase

            if (rollAgain.equals("no") || rollAgain.equals("n")) { // Condition to break the loop
                break;
            }
        }
        input.close(); // Closing the Scanner object to avoid resource leak
    }
}
