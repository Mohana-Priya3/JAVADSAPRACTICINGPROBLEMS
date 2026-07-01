package Day7;

public class RemoveDuplicates {
    public static void main(String[]args){
        int a[]={1,1,2,2,3,3,4,4,4,5};
        int b[]=new int[a.length];
        int i=1,j=1;
        b[0]=a[0];
        while(i<a.length){
            if(a[i]!=a[i-1]) {
                b[j] = a[i];
                j++;
            }
                i++;

        }
        for(int k=0;k<j;k++){
            System.out.print(b[k]+ " ");
        }
    }
}
