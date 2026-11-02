import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        boolean flag=true;
        if(n<=1){
            flag=false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(!flag){
            System.out.println("Not a Prime Number");
        }else{
            System.out.println("Prime Number");
        }
    }
}
