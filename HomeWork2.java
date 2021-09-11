/**
* Java 1. Home Work Lesson 2.
* @author Kayumov Rustem
* @version 11.09.2021
*/

class HomeWork2 {
    public static void main(String[] args) {
    System.out.println (less20Greater10());
    primerSvicha();
    eshePrimer();
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
    static void primerSvicha() {
        int a = 2;
        if (a == 1) {
            System.out.println("a = 1");
        }
        else if (a == 3) {
            System.out.println("a = 3");
        } else {
            System.out.println("Ни одно условие не сработало");
        }
    }
    static void eshePrimer() {
        int a = 4;
        switch (a) {
            case 1:
            System.out.println("a = 1");
            break;
            case 3:
            System.out.println("a = 3");
            break;
            default:
            System.out.println("Ни один case не сработал");
        }
    }

       
    