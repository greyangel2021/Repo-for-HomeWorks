/**
* Java 1. Home Work Lesson 5.
* @author Kayumov Rustem
* @version 27.09.2021
*/

class Worker {
    private String name;
    private String position;
    private String email;
    private int number;
    private int salary;
    private int age;
    
    Worker(String name, String position, String email, int number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
        
        public String getName() {
            return name;
        }
        public String getPosition() {
            return position;
        }
        public String getEmail() {
            return email;
        }
        public int getNumber() {
            return number;
        }
        public int getSalary() {
            return salary;
        }
        public int getAge() {
            return age;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        public void setPosition(String position) {
            this.position = position;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setNumber(int number) {
            this.number = number;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }
        public void setAge(int age) {
            this.age = age;
        }
        
        @Override
        public String toString() {
            return name + ", " + position + ", " + email + ", " + number + ", " + salary + ", " + age;
        }
}