
import java.util.Scanner;

//Write a program to check string is palindrome or not ?

public class q3stringIsPalindromeOrNot{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A Srting");
        String name = scanner.nextLine();

        String cleaned = name.toLowerCase();

        System.out.println(cleaned);

        boolean isPalindrome = true;
        int left =0;
        int right = cleaned.length()-1;

       while (left<right){
           if(cleaned.charAt(left)!=cleaned.charAt(right)){
            isPalindrome=false;
            break;
           }
           left++;
           right--;
        }

        if(isPalindrome){
            System.out.println("This String is Palidrome "+name);
        }else{
            System.out.println("This String is not Palidrome "+name);
        }
    }
}