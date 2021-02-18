/*Write a program to create an array of 10 integers. Accept values from the user in that array. 
Input another number from the user and find out how many numbers are equal to the number passed, 
how many are greater and how many are less than the number passed.*/

import java.util.Scanner;
public class userinputarray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int arr[];

        arr = new int[10];

        for (int i=0; i<10; i++){
            System.out.println("Enter value: ");
            int n =scan.nextInt ();
            arr[i]=n;

        }
        System.out.println("Enter a no. to campare(greater and less) value: ");
        int num=scan.nextInt();
        for (int i=0; i<10; i++){
            if (num==arr[i]){
                System.out.println("Given no. is equal to "+arr[i]);
            }
            else if (num> arr[i]){
                System.out.println("Given number is greater than "+ arr[i]);

            }
            else{
                System.out.println("Given number is less than "+arr[i]);
            }

    }


}
}
