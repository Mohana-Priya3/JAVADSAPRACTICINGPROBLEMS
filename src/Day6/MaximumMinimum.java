package Day6;
public class MaximumMinimum {
    public static void main(String[]args){
        int a[]={23,45,67,45,32};
        int minimum=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>maximum){
                maximum=a[i];
            }if(a[i]<minimum){
                minimum=a[i];
            }
        }
        System.out.println("The Maximum Element is "+maximum);
        System.out.println("The Minimum Element is "+minimum);


    }
}
