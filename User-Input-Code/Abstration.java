
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        abstract class Vehicle {
            abstract void start();
        }

        class Car extends Vehicle {
            void start() {
                System.out.println("Car starts");
            }
        }

        System.out.print("Enter Vehicle name: ");
        String name = sc.nextLine();

        if (name.equalsIgnoreCase("car")) {
            Car c = new Car();
            c.start();
        } else {
            System.out.println("Invalid Vehicle");
        }

        sc.close();
    }
}
