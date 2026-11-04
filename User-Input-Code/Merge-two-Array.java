import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of First Array: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.print("Enter the size of Second Array: ");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        int[] arr3=new int[arr1.length+arr2.length];
        System.out.print("Emter the Element of first Array: ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the Element of Second Array: ");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.print("Merged Array: ");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
