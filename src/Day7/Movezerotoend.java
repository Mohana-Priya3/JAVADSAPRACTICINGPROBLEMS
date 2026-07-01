package Day7;

public class Movezerotoend {
    public static void main(String[]args){
        int a[]={1,0,2,0,3,4,4,0,5,0,6};
        int i=0,j=a.length-1;
        while (i<j){
            if (a[i] == 0 && a[j] != 0) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
            else if(a[i]!=0){
                i++;
            }else{
                j--;
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+ " ");
        }
    }
}
