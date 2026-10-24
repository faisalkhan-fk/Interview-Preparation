import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int val=n%10;
            sum+=val;
            n=n/10;
        }
        System.out.print("Sum of digits is: "+sum);
    }
}
