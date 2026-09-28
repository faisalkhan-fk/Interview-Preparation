//Reverse Array in java
import java.util.*;
public class Main{
    public static void main(String[] args){
        int [] arr={3,4,6,8,4,1,9};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.print("Reverse Array is: "+Arrays.toString(arr));
    }
}
