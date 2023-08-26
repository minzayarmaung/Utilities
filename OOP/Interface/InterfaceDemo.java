package OOP.Interface;

interface Animal{
    void makesound();    // All are Abstract
    void poop();
}

class Cat implements Animal {
    @Override
    public void makesound() {
        // TODO Auto-generated method stub
        System.out.println("Meow");
    }

    @Override
    public void poop() {
        // TODO Auto-generated method stub
        System.out.println("Cat has pooped");
    }
}
class Dog implements Animal{
    @Override
    public void makesound() {
        System.out.println("Woof Woof");
        
    }
    @Override
    public void poop() {
        System.out.println("Dog has Pooped");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        c.makesound();
        c.poop();

        d.makesound();
        d.poop();
    }
}
