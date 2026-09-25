//Second Largest in the Array
import java.util.*;
public class Main{
    public static void main(String[] args){
        int [] arr={3,4,6,8,4,1,9};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }else if(arr[i]>second_largest && arr[i] != largest){
                second_largest=arr[i];
            }
        }
        System.out.println("Second Highest Number is: "+second_largest);
    }
}
