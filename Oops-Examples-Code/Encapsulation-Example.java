//Encapsulation example with Student class
public class Main{
public static void main(String[] args){
    Student sc=new Student();
    System.out.print(sc.getage());
     }
  }
class Student{
    private int age=20;
    public int getage(){
    return age;
 }
}
