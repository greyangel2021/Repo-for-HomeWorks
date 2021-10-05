/**
* Java 1. Home Work Lesson 7.
* @author Kayumov Rustem
* @version 04.10.2021
*/

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }
    
    void setFullness(boolean status) {
        fullness = status;
    }
    
    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }
    
    @Override
    public String toString() {
        return "{name=" + name + ", appetite=" +
            appetite + ", fullness=" + fullness + "}";
    }
}