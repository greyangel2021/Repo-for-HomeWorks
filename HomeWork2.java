/**
* Java 1. Home Work Lesson 2.
* @author Kayumov Rustem
* @version 11.09.2021
*/

class HomeWork2 {
    public static void main(String[] args) {
    System.out.println (less20Greater10());
    }
    
    static boolean less20Greater10() {
        int a = 12;
        int b = 7;
        int sum = a + b;
        if (10 < sum && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    static void posOrNeg(int a) {
        if (a >= 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }

    static boolean negOrPos(int a) {
        if (a >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
        

