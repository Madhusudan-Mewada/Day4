//Write a program to check whether two Array are equal or not?

public class  q2twoArrayAreEqualOrNot{
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        boolean isEqual = true;

        // Step 1: Check length
        if (arr1.length != arr2.length) {
            isEqual = false;
        } else {
            // Step 2: Compare elements one by one
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }
        }

        // Output
        if (isEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
