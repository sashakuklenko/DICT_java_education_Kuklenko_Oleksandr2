package Hangman;
import java.util.Scanner;
import java.util.Random;

public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");


        String[] words = {"python", "java", "javascript", "kotlin"};


        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];


        System.out.println("Guess the word:");


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