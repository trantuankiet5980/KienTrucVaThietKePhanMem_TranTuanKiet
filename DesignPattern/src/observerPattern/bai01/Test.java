package observerPattern.bai01;

public class Test {
    public static void main(String[] args) {
        ClassLeader classLeader = new ClassLeader();

        Student student1 = new Student("Sinh viên A");
        Student student2 = new Student("Sinh viên B");
        Student student3 = new Student("Sinh viên C");

        classLeader.attach(student1);
        classLeader.attach(student2);
        classLeader.attach(student3);

        classLeader.setMessage("Lịch thi sẽ được công bố vào tuần sau!");

        classLeader.setMessage("Hãy chuẩn bị bài tập nhóm trước khi cuối tuần!");

        classLeader.detach(student2);

        classLeader.setMessage("Cập nhật lịch học mới!");
    }
}
