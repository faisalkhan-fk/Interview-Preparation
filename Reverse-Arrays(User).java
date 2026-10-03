//Reverse Array User Input
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Arrays: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
