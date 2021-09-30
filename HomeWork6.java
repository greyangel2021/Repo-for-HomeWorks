/**
* Java 1. Home Work Lesson 6.
* @author Kayumov Rustem
* @version 30.09.2021
*/

class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500,10);
        
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(100));
            System.out.println(animal.run(300));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(8));
            System.out.println(animal.swim(12));
        }
        //System.out.println("Animal were created: " + cat.CountOfAnimals());
    }
}