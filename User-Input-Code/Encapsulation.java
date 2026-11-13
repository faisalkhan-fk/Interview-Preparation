import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        s.setage(age);

        System.out.println("Your age is: " + s.getage());
    }
}

class Student {
    private int age;

    public void setage(int a) {
        age = a;
    }

    public int getage() {
        return age;
    }
}
