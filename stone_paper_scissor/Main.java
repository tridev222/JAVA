import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Stone Paper Scissor game!");
        System.out.println("Choose your hand (Stone, Paper, Scissor): ");

        String player = input.next();
        String[] choices = {"Stone", "Paper", "Scissor"};

        // Randomly pick a choice for the computer
        String computer = choices[random.nextInt(choices.length)];

        System.out.println("Computer chose: " + computer);

        // Compare the player's choice with the computer's choice
        if (player.equalsIgnoreCase(computer)) {
            System.out.println("It's a Draw!");
        } else if (player.equalsIgnoreCase("Stone") && computer.equals("Scissor")
                || player.equalsIgnoreCase("Paper") && computer.equals("Stone")
                || player.equalsIgnoreCase("Scissor") && computer.equals("Paper")) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }
    }
}
