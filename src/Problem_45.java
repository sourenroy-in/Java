 // Hierarchical Inheritance

class Animal{
    void eat(String Food) {
        System.out.println("Animal eats: "+ Food);
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("cat Meow");
    }
}


public class Problem_45 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat("Meat");
        d.bark();

        Cat c = new Cat();
        c.eat("Milk");
        c.meow();
    }
    
}

