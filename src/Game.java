import java.util.Random;
import java.util.Scanner;

public class Game {
    int computer;
    int user;
    int guesses;

    public Game() {
        Random random = new Random();
        computer = random.nextInt(101);
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number...");
        user = scanner.nextInt();
    }

    public void isCorrect() {
        System.out.println("Generated number is between 0 and 100.");
        boolean flag = true;
        while (flag) {
            takeUserInput();
            if (user > computer) {
                System.out.println("Not Matched! Greater than the generated number.\n");
                guesses++;
            } else if (user < computer) {
                System.out.println("Not Matched! Smaller than the generated number.\n");
                guesses++;
            } else {
                System.out.println("Congratulations! Number Matched.\n");
                guesses++;
                flag = false;
            }
        }
        System.out.println("You took " + getGuesses() + " guesses to be matched.");
    }
}

