/**
* Java 1. Home Work Lesson 1
* @author Kayumov Rustem
* @version 10.09.2021
*/

public class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }
    
    static void checkSumSign() {
        int a = 5;
        int b = -8;
            System.out.println ("The amount is " + (a + b >= 0? "positive" : "negative"));
        }
    
    static void printColor() {
        int value = 54;
        if (value <= 0) {
            System.out.println ("Red");
        }
        if (value > 0 && value < 100) {
            System.out.println ("Yellow");
        }
        if (value >= 100) {
            System.out.println ("Green");
        }
        }
        
    static void compareNumbers() {
        int a = 37;
        int b = 49;
            System.out.println ("a " + (a >= b? ">= b" : "< b"));
        }
    }




