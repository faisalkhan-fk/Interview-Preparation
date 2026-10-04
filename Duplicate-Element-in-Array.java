public class Main{
    public static void main(String[] args){
        int[] arr={2,3,5,4,6,7,8,9,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print("Duplicate element: "+arr[i]);
                }
            }
        }
    }
}
