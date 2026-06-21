package Day6;

public class SecondLargest {
    public static void main(String args[]){
        int a[]={23,45,1,34,78};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            if(a[i]>largest){
                secondlargest=largest;
                largest=a[i];
            }else if(a[i]>secondlargest&&a[i]<largest){
                secondlargest=a[i];
            }
        }
        System.out.println("the Second Largest number is "+secondlargest);

    }
}
