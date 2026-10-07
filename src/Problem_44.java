//Multi level interface
class Animal {
    void showAnimal(String name) {
        System.out.println("Animal : " + name);
    }
}

class Dog extends Animal {
    void showDog() {
        System.out.println("dog barks");
    }
}

class puppy extends Dog {
    void showPuppy(String name) {
        super.showAnimal(name);
        super.showDog();
        System.out.println("Puppy is a Dog");
    }
}

class Problem_44 {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.showPuppy("merry");
    }
}