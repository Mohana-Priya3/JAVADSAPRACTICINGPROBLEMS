package Day5;
public class LinearSearch {
    public static void main(String[]args){
        int []arr={2,4,6,5,8};
        int find=90;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find) {
                System.out.println("Value is found");
                found =true;
                break;
            }
        }
        if(!found){
            System.out.println("Value is not found");
        }
    }
}
