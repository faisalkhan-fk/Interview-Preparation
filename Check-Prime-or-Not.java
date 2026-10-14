//Prime checking functionality
import java.util.*;
public static void main(String [] args){
    int n=1;
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
        System.out.print("Not a prime number");
    }else{
        System.out.print("Prime Number");
    }
}
