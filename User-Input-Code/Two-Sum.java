import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int target=9;
        System.out.print("Enter the element of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                System.out.print("Indexes are: "+map.get(complement)+" "+i);
                return;
            }
            map.put(arr[i],i);
        }
    }
}
