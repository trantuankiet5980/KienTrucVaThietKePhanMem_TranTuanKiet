package observerPattern.bai01;

public class Test {
    public static void main(String[] args) {
        ClassLeader classLeader = new ClassLeader();

        Student student1 = new Student("Sinh viên A");
        Student student2 = new Student("Sinh viên B");
        Student student3 = new Student("Sinh viên C");

        classLeader.register(student1);
        classLeader.register(student2);
        classLeader.register(student3);

        classLeader.setMessage("Lịch thi sẽ được công bố vào tuần sau!");

        classLeader.setMessage("Hãy chuẩn bị bài tập nhóm trước khi cuối tuần!");

        classLeader.remove(student2);

        classLeader.setMessage("Cập nhật lịch học mới!");
    }
}
