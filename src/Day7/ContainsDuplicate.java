package Day7;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[]args){
        int a[]={1,2,3,4,5


        };
        boolean result=false;
        HashSet<Integer>set=new HashSet<>();
        for(int num:a){
            if(!set.add(num)){
                result=true;
                break;
            }
        }
        if(!result){
            System.out.println("it is not duplicate");
        }else{
            System.out.println("it is  duplicate");

        }
    }
}
