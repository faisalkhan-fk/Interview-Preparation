import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int val=n%10;
            rev=rev*10+val;
            n=n/10;
        }
        System.out.print("Reverse of a digits is: "+rev);
    }
}
