//Hightest Number in java
import java.util.*;
public class Main{
    public static void main(String[] args){
        int [] arr={3,4,6,8,4,1,9};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Highest Number is: "+largest);
    }
}
