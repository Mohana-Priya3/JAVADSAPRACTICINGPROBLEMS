package Day6;
import java.util.Scanner;
public class CheckOccurence {
    public static void main(String[]args){
        try (Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the input size");
            int n=sc.nextInt();
            int[]a=new int [n];
            System.out.println("Enter the elements");
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the target value");
            int target=sc.nextInt();
            boolean result=false;
            for(int i=0;i<a.length;i++) {
                if (a[i] == target) {
                    result = true;
                    break;
                }
            }
            System.out.println(result);

            }
        }
    }

