/**
* Java 1. Home Work Lesson 5.
* @author Kayumov Rustem
* @version 27.09.2021
*/

class HomeWork5 {
    public static void main(String[] args) {
    
        Worker[] persArray = new Worker [5];
            persArray[0] = new Worker("Sergey Esenin", "Poet", "esenin@ruspo.com", 121111111, 90000, 48);
            persArray[1] = new Worker("Vladimir Vysotsky", "Singer", "vysotsky@ruspo.com", 122222222, 85000, 41);
            persArray[2] = new Worker("Alexander Pushkin", "Poet", "pushkin@ruspo.com", 123333333, 77000, 36);
            persArray[3] = new Worker("Mikhail Lermontov", "Novelist", "lermontov@ruspo.com", 124444444, 78000, 38);
            persArray[4] = new Worker("Alexander Rosenbaum", "Singer", "rosenbaum@ruspo.com", 125555555, 85000, 54);
            for(Worker worker : persArray)
                if (worker.getAge() > 40)
                    System.out.println(worker);
    }
}