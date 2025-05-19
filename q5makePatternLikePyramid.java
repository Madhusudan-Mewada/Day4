//Write a program to make such a pattern like a
// pyramid with a number that repeats in the same row.

import java.util.Scanner;
public class q5makePatternLikePyramid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter the Number Of Rows");
        int rows = scanner.nextInt();

        int count = 0;

        for(int i=1;i<=rows;i++){
            count =count+1;
            for(int j=1;j<=i;j++){
                System.err.print(count);
            }
            System.err.println("");
        }
    }    
}
