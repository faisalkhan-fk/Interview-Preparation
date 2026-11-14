
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        class Animal {
            void eat() {
                System.out.println("Animal is Eating");
            }
        }

        class dog extends Animal {
            void bark() {
                System.out.println("Dog is Barking");
            }
        }

        dog d = new dog();

        System.out.println("1. Eat");
        System.out.println("2. Bark");
        System.out.println("3. Both");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                d.eat();
                break;

            case 2:
                d.bark();
                break;

            case 3:
                d.eat();
                d.bark();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
