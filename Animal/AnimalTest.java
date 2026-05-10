package Animal;
final class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
//Error Cann't inherit from final class
class Dog extends Animal {
    void sound(){
        System.out.println("Dog barks");
    }
}
public class AnimalTest {
    public static void main(String args[]){
    
        Dog d = new Dog();
        d.sound();
    }
    
}
