package Hangman;
import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;

public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");

        String[] words = {"python", "java", "javascript", "kotlin"};

        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];

        char[] progress = new char[wordToGuess.length()];
        for (int i = 0; i < wordToGuess.length(); i++) {
            progress[i] = '-';
        }

        HashSet<Character> guessedLetters = new HashSet<>();

        int attemptsLeft = 8;

        Scanner scanner = new Scanner(System.in);

        while (attemptsLeft > 0) {
            System.out.println("\n" + String.valueOf(progress));
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Input a letter: > ");
            String input = scanner.nextLine();


            if (input.length() != 1) {
                System.out.println("Please input a single letter.");
                continue;
            }

            char guessedLetter = input.charAt(0);


            if (guessedLetters.contains(guessedLetter)) {
                System.out.println("You've already guessed this letter.");
                continue;
            }

            guessedLetters.add(guessedLetter);


            boolean isCorrect = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guessedLetter) {
                    progress[i] = guessedLetter;
                    isCorrect = true;
                }
            }


            if (!isCorrect) {
                attemptsLeft--;
                System.out.println("That letter doesn't appear in the word.");
            }


            if (String.valueOf(progress).equals(wordToGuess)) {
                System.out.println("\n" + wordToGuess);
                System.out.println("You guessed the word!");
                System.out.println("You survived!");
                return;
            }
        }

        System.out.println("You lost!");
    }
}