// cschumacher_06212026_mod2_3_csd402
// https://github.com/LittleIowaBoy/csd-402/tree/main

import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computerChoice = random.nextInt(3) + 1; // Generates 1, 2, or 3

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");

        // Sanitize user input
        int userChoice;
        if (scanner.hasNextInt()) {
            userChoice = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
            scanner.close();
            return;
        }

        // Validate user input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            scanner.close();
            return;
        }

        // Convert numeric choices to labels
        String[] labels = {"", "Rock", "Paper", "Scissors"};
        String userLabel = labels[userChoice];
        String computerLabel = labels[computerChoice];

        System.out.println("----------------------------");
        System.out.println("Your selection:      " + userChoice + " (" + userLabel + ")");
        System.out.println("Computer's selection: " + computerChoice + " (" + computerLabel + ")");
        System.out.println("----------------------------");

        // Determine results
        if (userChoice == computerChoice) {
            System.out.println("Result: It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3)  // Rock beats Scissors
                || (userChoice == 2 && computerChoice == 1)  // Paper beats Rock
                || (userChoice == 3 && computerChoice == 2)) { // Scissors beats Paper
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        scanner.close();
    }
}

