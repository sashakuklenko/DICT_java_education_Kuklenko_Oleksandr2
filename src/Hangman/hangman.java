package Hangman;
import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;

public class hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("HANGMAN");

        while (true) {
            System.out.print("Type \"play\" to play the game, \"exit\" to quit: > ");
            String choice = scanner.nextLine();

            if (choice.equals("play")) {
                playGame(scanner);
            } else if (choice.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please type \"play\" or \"exit\".");
            }
        }
    }

    public static void playGame(Scanner scanner) {

        String[] words = {"python", "java", "javascript", "kotlin"};

        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];

        char[] progress = new char[wordToGuess.length()];
        for (int i = 0; i < wordToGuess.length(); i++) {
            progress[i] = '-';
        }

        HashSet<Character> guessedLetters = new HashSet<>();
        int mistakes = 0;
        final int maxMistakes = 8;

        while (mistakes < maxMistakes) {
            System.out.println("\n" + String.valueOf(progress));
            System.out.println("Mistakes left: " + (maxMistakes - mistakes));
            System.out.print("Input a letter: > ");
            String input = scanner.nextLine();

            if (input.length() != 1) {
                System.out.println("You should input a single letter.");
                continue;
            }

            char guessedLetter = input.charAt(0);

            if (!Character.isLowerCase(guessedLetter) || !Character.isLetter(guessedLetter)) {
                System.out.println("Please enter a lowercase English letter.");
                continue;
            }

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
                mistakes++;
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