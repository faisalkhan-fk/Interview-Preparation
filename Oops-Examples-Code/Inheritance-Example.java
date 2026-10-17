//Inheritance example with Animal and Dog classes
class Main{
    public static void main(String[] args){
        class Animal{
            void eat(){
                System.out.println("Animal is Eating ");
            }
        }class dog extends Animal{
            void bark(){
                System.out.println("Dog is Barking");
            }
        }
        dog d=new dog();
        d.eat();
        d.bark();
    }
}
