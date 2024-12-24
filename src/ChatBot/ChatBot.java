package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        String botName = "Chatty"; // Ім'я бота
        int birthYear = 2024; // Рік створення

        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");

        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("What a great name you have, " + userName + "!");
    }
}