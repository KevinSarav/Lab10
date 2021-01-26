class Animal{
    public Animal(){
        System.out.println("A new animal has been created.");
    }

    public void eat(){
        System.out.println("An animal is eating.");
    }
}

class Dog extends Animal{
    public Dog(){
        super();
        System.out.println("A new dog has been created.");
    }

    public void eat(){
        System.out.println("A dog is eating.");
    }

    public void speak(){
        System.out.println("A dog has barked.");
    }
}

class Puppy extends Dog{
    public Puppy(){
        super();
        System.out.println("A new puppy has been created.");
    }

    public void eat(){
        super.eat();
    }

    public void speak() {
        System.out.println("A puppy has yipped.");
    }
}

public class Main {

    public static void main(String[] args) {
	    Animal anim = new Animal();
	    Dog dogg = new Dog();
	    Puppy pup = new Puppy();
	    anim.eat();
	    dogg.eat();
	    dogg.speak();
	    pup.eat();
	    pup.speak();
    }
}