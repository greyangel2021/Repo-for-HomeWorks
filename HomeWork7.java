/**
* Java 1. Home Work Lesson 7.
* @author Kayumov Rustem
* @version 05.10.2021
*/

class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Bazil", 15), new Cat("Stampy", 10), new Cat("Chin-Chao", 20)
        };
        Plate plate = new Plate(50, 30);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}
