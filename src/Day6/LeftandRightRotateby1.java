package Day6;
import java.util.Scanner;
public class LeftandRightRotateby1 {
    public static void main(String[]args){
        try(Scanner sc=new Scanner(System.in)) {
            System.out.println("Enter the Input size");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            //left
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
            System.out.println("After Left Rotate");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            //right
            int temp1 = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp1;
            System.out.println("After Right rotate");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");

            }
        }
    }
}
