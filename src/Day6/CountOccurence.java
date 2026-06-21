package Day6;

public class CountOccurence {
    public static void main(String[]args){
        int a[]={2,3,4,4,5,5,3,3,5,6,7,7,6};
        int count=0;
        for(int i=0;i<a.length;i++){
            boolean hasfound=false;
            for(int k=0;k<i;k++){
                if(a[i]==a[k]){
                    hasfound=true;
                }
            }
            if(hasfound){
                continue;
            }
            count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            System.out.println("The count of "+a[i]+" "+count);
            count=0;
        }
    }

}
