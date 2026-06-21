package Day6;
import java.util.Scanner;
public class ArrayReverseTwoPointer {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int originalarray[]=new int [3];
        System.out.println("Enter the datas");
        for(int i=0;i<originalarray.length;i++){
            originalarray[i]=sc.nextInt();
        }int i=0,j=originalarray.length-1;
        while(j>i){
            int temp=originalarray[i];
            originalarray[i]=originalarray[j];
            originalarray[j]=temp;
            i++;
            j--;
        }
        System.out.println("The Reverse array is ");
        for(int number:originalarray){
            System.out.println(number);
        }

    }
}
