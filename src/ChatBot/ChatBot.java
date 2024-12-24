package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        String botName = "Chatty";
        int birthYear = 2024;

        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");

        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("What a great name you have, " + userName + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want!");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into smaller parts.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int answer;
        do {
            answer = scanner.nextInt();
            if (answer != 2) {
                System.out.println("Please, try again.");
            }
        } while (answer != 2);

        System.out.println("Congratulations, you got it right!");
        System.out.println("Goodbye, have a nice day!");
    }
}