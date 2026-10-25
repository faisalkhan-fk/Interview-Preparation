import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int Minimum=Integer.MAX_VALUE;
        System.out.print("Enter the element of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Minimum){
                Minimum=arr[i];
            }
        }
        System.out.println("Smallest Number is: "+Minimum);
    }
}
