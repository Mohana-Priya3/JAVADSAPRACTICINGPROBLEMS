package Day6;

public class FirstandLastoccurence {
    public static void main(String[]args){
        int []a={23,2,4,5,2,2,5};
        int found=0;
        int first=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==5){
                found=i;
            }
            if(a[i]==2){
                if(first==-1) {
                    first=i;
                    System.out.println("Element found at " + first);
                }
            }
        }
        System.out.println("Element found at "+found);
    }
}
