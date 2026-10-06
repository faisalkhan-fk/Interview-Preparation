import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={2,3,4,6,7};
        int target=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
            System.out.print(map.get(complement)+" "+i);
            return;
            }
            map.put(arr[i],i);
        }
    }
}
