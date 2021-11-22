package chapterFour;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        String prompt = """
                For Yoruba press 1
                For Igbo press 2
                For English press 3
                For Edo press 4
                For Hausa press
                """;

        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("I speak yoruba");
            case 2:
                System.out.println("I speak igbo");
            break;
            case 3:
                System.out.println("I speak english");
            break;
            case 4:
                System.out.println("I speak Edo");
            break;
            case 5:
                System.out.println("I speak Hausa");
            default:
                System.out.println("Get sense");

        }
    }
}
