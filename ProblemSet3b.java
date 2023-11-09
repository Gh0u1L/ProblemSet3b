

//Blake Nelson

//I got some help from my brother (I hope thats ok)

import java.util.Scanner;
public class ProblemSet3b
{
public class RockPaperCrossbladesGame {
    private static final String[] choices = {"Rock", "Paper", "Crossblades"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades!");
        String response = scanner.nextLine();
        evaluate(getChoice(response));
    }

    private static int getChoice(String response) {
        if (response.length() < 50) {
            return -1;
        } else if (response.contains("paper")) {
            return 2;
        } else if (response.contains("crossblades")) {
            return 3;
        } else {
            return 1;
        }
    }

    private static void evaluate(int choice) {
        if (choice == -1) {
            printDisqualifiedMessage();
        } else {
            int computerChoice = (int) (Math.random() * 3) + 1;
            System.out.println("Computer: Your choice has been noted. Let the battle begin!");
            getFinalResult(computerChoice, choice);
        }
    }

    private static void printDisqualifiedMessage() {
        System.out.println("Computer: Your response lacks the necessary drama! You have been disqualified, prepare for your defeat, weakling!");
    }

    private static void getFinalResult(int computer, int human) {
        System.out.println("Computer: The time has come to reveal our weapons!");
        System.out.println("Computer: You chose " + choices[human - 1] + "!");
        System.out.println("Computer: I chose " + choices[computer - 1] + "!");
        System.out.print("Result: ");

        if (computer == human) {
            System.out.println("Unbelievable! We have tied! *Eye twitches*");
        } else if ((computer == 1 && human == 2) || (computer == 2 && human == 3) || (computer == 3 && human == 1)) {
            System.out.println("Computer: Argh! You have bested me with your " + choices[human - 1] + "! Congratulations, mortal.");
        } else {
            System.out.println("Computer: As I predicted, I have won this battle. The kingdom is MINE!");
        }
    }
}
}
