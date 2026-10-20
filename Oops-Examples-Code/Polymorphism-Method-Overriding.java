//Implement method overriding in Animal class
public class Main{
    public static void main(String[] args){
        class Animal{
            void sound(){
                System.out.println("Animal makes a sound");
            }
        }
        class dog extends Animal{
            @Override
            void sound(){
                System.out.println("Dog barking");
            }
        }
        dog d=new dog();
        d.sound();
    }
}
