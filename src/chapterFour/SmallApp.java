package chapterFour;

import java.util.Scanner;

public class SmallApp {
    public static void main(String[] args) {
        int total = 0;
        int number = 0;
        double average = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        do {
            System.out.println("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            total = total + number;
            average = total / 2;
            number = scanner.nextInt();
            if (min > number && number != -49) {
                min = number;
            }
            if(max < number){
                max = number;
            }




        }



//            System.out.println("sum is " + total);
            while (number != -49) ;
        System.out.printf("total is %d%n", total);
        System.out.printf("average is %.2f%n", average);
        System.out.printf("min is %d%n", min);
        System.out.printf("max is %d%n", max);


    }
}
