//Polymorphism Calculator class with method overloading
public class Main{
    public static void main(String[] args){
        class Calculator{
            int add(int a,int b){
              return a+b;
            }
            int add(int a,int b,int c){
                return a+b+c;
            }
        }
        Calculator c=new Calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(4,5,6));
    }
}
