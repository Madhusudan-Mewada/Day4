// Write a program to find largest number in Array ?

public class q1larestNumberInArr{
    public static void main(String[] args){

        int[] array = {24,16,33,99,15,25,58,64,55,120,200};
        int max=0;

        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("The Largest Number in the Array is "+max);
    }
}