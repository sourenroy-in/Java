class Animal {
    void sound() {
        System.out.println("Animal Sounds");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat Meow");
    }
}

public class Problem_47 {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
