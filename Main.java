public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("Vasya", 150);
        Member member2 = new Member("Petr", 130);
        Member member3 = new Member("Dima", 125);
        Member member4 = new Member("Gena", 116);
        Team team = new Team("DreamTeam", member1, member2, member3, member4);
        Course course = new Course(115, 120, 131);

        course.finishCourse(team);

        team.printInfoAboutMembers();
        System.out.println();
        team.printInfoAboutMembersWhichFinishedCourse();
    }
}
