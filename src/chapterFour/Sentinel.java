package chapterFour;

import java.util.Scanner;
//pseudocode of Sentinel iteration
//collect score
//if score is equal or less than a specify number
//Add total score
public class Sentinel {
    public static void main(String[] args) {
        int total = 0;
        int score = 0;

        do{
            System.out.println("Enter a score: ");
            Scanner scanner = new Scanner(System.in);
            total = total + score;
            score = scanner.nextInt();
        }
        while (score >= 0 && score < 101);

        System.out.println("Total is "+total);
    }
}
