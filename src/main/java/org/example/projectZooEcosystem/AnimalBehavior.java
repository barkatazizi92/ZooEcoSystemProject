package org.example.projectZooEcosystem;


/*
 Interface
 AnimalBehavior: Defines methods eat(), sleep(), and
 makeSound(). These methods represent common actions that all animals in
 the zoo might perform, but the specifics of these actions will vary depending
 on the animal type.
 */
public interface AnimalBehavior {

    public void eat();

    public void sleep();

    public void makeSound();
}

/*
     Abstract Class Animal: Implements AnimalBehavior. This class serves as
 the base for all animal types, providing implementation for some methods of
 AnimalBehavior that are common across all animals, such as sleep(), and
 defining abstract methods like displayInformation() to show details about
 the animal.

     */
abstract class Animal implements AnimalBehavior {
    public abstract void eat();

    // Abstract methods to be implemented by subclasses

    @Override
    public void sleep() {
        System.out.println("Animal's sleep more then 5 hours");
    }

    abstract void displayInformation();
}

/*
Part 2: Creating Specific Animal Classes
 Class Mammal and Bird: Extend the Animal class. These classes will
 override the eat(), makeSound(), and displayInformation() methods to
 provide specific behaviors and information display mechanisms for
 mammals and birds, respectively.
 */
/*
 Further Specialization: Within the Mammal and Bird classes, create specific
 animals, such as Lion, Elephant (Mammals), and Parrot, Eagle (Birds).
 These specific animal classes will override the methods from their parent
 classes to provide behaviors and sounds unique to each animal.
 */
class Mammal extends Animal {
    @Override
    public void eat() {
        System.out.println("Mammals are eating more then one kg food daily");
    }

    @Override
    public void makeSound() {
        System.out.println("Mammals are making sound");
    }

    @Override
    void displayInformation() {
        System.out.println("This animals are so cute");
    }
}

class Loin extends Mammal {
    @Override
    public void eat() {
        System.out.println("Loin eat meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Loin roar very loud");
    }

    @Override
    void displayInformation() {
        System.out.println("Loin is called the king of wood");
    }
}

class Elephant extends Mammal {
    @Override
    public void eat() {
        System.out.println("Elephant are eating vegetable and fruit");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant are making very loud sound");
    }

    @Override
    void displayInformation() {
        System.out.println("Elephant are huge");
    }
}

class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("Birds are eating very less");
    }

    @Override
    public void makeSound() {
        System.out.println("Birds are making very nice sound");
    }

    @Override
    void displayInformation() {
        System.out.println("Birds are so cute");
    }
}

class Parrot extends Bird {
    @Override
    public void eat() {
        System.out.println("Parrot eat seeds");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot make very cute sound");
    }

    @Override
    void displayInformation() {
        System.out.println("Parrot are very cute");
    }
}

class Eagle extends Bird {
    @Override
    public void eat() {
        System.out.println("Eagle are eating meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle are making noisy sound ");
    }

    @Override
    public void displayInformation() {
        System.out.println("Eagle are very creative hunt ");
    }
}

/*
Inheritance: Demonstrated by the class hierarchy starting from Animal to
 Mammal/Bird to specific animals like Lion, Elephant, etc.
 */
class ZooEcosystem {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.eat();
        mammal.makeSound();
        mammal.displayInformation();
        mammal.sleep();
        System.out.println("***************************");
        Loin loin = new Loin();
        loin.eat();
        loin.makeSound();
        loin.displayInformation();
        loin.sleep();
        System.out.println("*****************************");
        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.makeSound();
        elephant.displayInformation();
        elephant.sleep();
        System.out.println("*******************************");
        Bird bird = new Bird();
        bird.eat();
        bird.makeSound();
        bird.displayInformation();
        System.out.println("*****************************");
        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.makeSound();
        parrot.displayInformation();
        parrot.sleep();
        System.out.println("*******************************");
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.makeSound();
        eagle.displayInformation();
        eagle.sleep();

    }
}

/*
 Polymorphism and Method Overriding: Specific animal classes overriding
 behavior methods like eat(), makeSound(), and displayInformation().
 */
class ZooEcoSystemTester {
    public static void main(String[] args) {

        Animal[] object = {new Loin(), new Elephant(), new Parrot(), new Eagle()};
        for (int i = 0; i < object.length; i++) {
            Animal behavior = object[i];
            behavior.eat();
            behavior.makeSound();
            behavior.displayInformation();
            behavior.sleep();
        }
    }
}


