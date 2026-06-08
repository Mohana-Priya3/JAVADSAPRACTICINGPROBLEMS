package Day5;
import java.util.Scanner;
public class Arrayoperations {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the datasize");
        int datasize=sc.nextInt();
        if(datasize==0){
            System.out.println("Array is empty");
            return;
        }
        int[]arr=new int[datasize];
        System.out.println("Enter the elments");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }int sum=0;
        int minimum=arr[0];
        int maximum=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]<minimum){
                minimum=arr[i];
            }if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        System.out.println("The sum of an array is "+sum);
        System.out.println("The maximum element in an array is "+maximum);
        System.out.println("The minimum element in an array is "+minimum);
        sc.close();

    }
}
