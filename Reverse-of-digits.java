public class Main{
    public static void main(String[] args){
        int num=13243;
        int sum=0;
        while(num>0){
            int val=num%10;
            sum=sum*10+val;
            num=num/10;
        }
        System.out.print("Reverse of digits: "+sum);
    }
}
