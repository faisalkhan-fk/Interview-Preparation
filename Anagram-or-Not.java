import java.util.*;
public class Main{
    public static void main(String[] args){
    String str1="kill";
    String str2="ilk";
    char[] a=str1.toCharArray();
    char[] b=str2.toCharArray();
    
    Arrays.sort(a);
    Arrays.sort(b);
    if(Arrays.equals(a,b)){
        System.out.print("Anagram");
    }else{
        System.out.print("Not a Anagram");
    }
    }
}
