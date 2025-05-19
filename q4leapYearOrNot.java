//Write a program that takes a year from the user and prints 
//whether it is a leap year or not?

import java.util.Scanner;
public class q4leapYearOrNot{
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Enter A Year");
        int year = scanner.nextInt();


        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.err.println("This Year is Leap Year "+year);
        } else {
            System.err.println("This Year is  not Leap Year "+year);
        }
    }    
}
