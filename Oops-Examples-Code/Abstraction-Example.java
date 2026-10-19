//Abstraction Example with Vehicle and car classes
public class Main{
    public static void main(String[] args){
      abstract class Vehicle{
          abstract void start();
      }
 class car extends Vehicle{
     void start(){
         System.out.println("Car starts");
     }
    }
    car c=new car();
    c.start();
  }
}
