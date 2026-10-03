import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={3,4,2,1,7,8};
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.lemgth;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        System.ou.print(minimum);
    }
}
