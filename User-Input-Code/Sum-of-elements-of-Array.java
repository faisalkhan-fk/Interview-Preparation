import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.println("Enter the Elements of Array: ");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt(); 
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of elemets is: "+sum);
    }
}
