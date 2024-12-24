package Hangman;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");

        System.out.println("Guess the word:");

        String wordToGuess = "java"; // Можете змінити це слово
        Scanner scanner = new Scanner(System.in);

        System.out.print("> ");
        String userGuess = scanner.nextLine();

        if (userGuess.equals(wordToGuess)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}