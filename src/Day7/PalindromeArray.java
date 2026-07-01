package Day7;
import java.util.Scanner;
public class PalindromeArray {
    public static void main(String[]args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the size of array");
            int size=sc.nextInt();
            int array[]=new int[size];
            System.out.println("Enter the elements");
            for(int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }
            int i=0,j=array.length-1;
            boolean ispalindrome=true;
            while(i<j){
                if(array[i]==array[j]){
                    i++;
                    j--;
                }
                else{
                    ispalindrome=false;
                    break;

                }
            }
            if(ispalindrome){
                System.out.println(("it is palindrome"));
            }else{
                System.out.println(("it is not palindrome"));

            }
        }
    }
}
