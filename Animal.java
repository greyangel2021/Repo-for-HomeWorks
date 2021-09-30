/**
* Java 1. Home Work Lesson 6.
* @author Kayumov Rustem
* @version 30.09.2021
*/

abstract class Animal implements IAnimal {
    private int runLimit;
    private int swimLimit;
    private String className;
    
    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
    }
    
    public String getClassName() {
        return className;
    }
        
    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + " can not run " + distance;
        }
        else {
            return className + " Success ran " + distance;
        }
    }
    
    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + " can not swim " + distance;
        }
        else {
            return className + " Success swim " + distance;
        }
    }
    
    @Override
    public String toString() {
        return className + ". runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }
}
