import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int answer = 37;
        boolean correctGuess;
        System.out.println("Guess the number!");
        int userInput = input.nextInt();

        do {
            if (userInput < answer) {
                System.out.println("TOO LOW");
                System.out.println("Guess again: ");
                userInput = input.nextInt();
                correctGuess = true;
            } else if (userInput > answer) {
                System.out.println("TOO HIGH");
                System.out.println("Guess again: ");
                userInput = input.nextInt();
                correctGuess = true;
            } else {
                System.out.println("Correct answer!");
                correctGuess = false;
            }
        } while(correctGuess);
    }
}
