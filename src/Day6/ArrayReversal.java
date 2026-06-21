package Day6;
import java.util.Scanner;
public class ArrayReversal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input size");
        int n=sc.nextInt();
        int originalarray[]=new int[n];
        for(int i=0;i< originalarray.length;i++){
            originalarray[i]=sc.nextInt();
        }
        System.out.println("The Original Array is ");
        for(int i=0;i<originalarray.length;i++){
            System.out.println(originalarray[i]);
        }
        int j=0;
        int  []reversearray=new int[n];
        for(int i=originalarray.length-1;i>=0;i--){
            reversearray[j]=originalarray[i];
            j++;
        }
        System.out.println("The Reverse Array is ");
        for(int i=0;i<reversearray.length;i++){
            System.out.println(reversearray[i]);
        }
    }
}
