public class Member {
    String name;
    int jumpHeight;
    boolean isFinished;

    public Member(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
    }

    public void info() {
        System.out.println(name + " " + jumpHeight + " " + isFinished);
        isFinished = false;
    }
}
