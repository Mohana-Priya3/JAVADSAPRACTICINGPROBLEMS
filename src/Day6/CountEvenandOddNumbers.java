package Day6;
import java.util.Scanner;
public class CountEvenandOddNumbers {
    public static void main(String[]args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the Input size");
            int n=sc.nextInt();
            int a[]=new int [n];
            System.out.println("Enter the values");
            for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even "+even);
            System.out.println("odd"+odd);

        }
    }
}
