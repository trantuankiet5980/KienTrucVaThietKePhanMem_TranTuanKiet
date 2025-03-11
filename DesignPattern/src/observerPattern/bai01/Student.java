package observerPattern.bai01;

public class Student implements Observer{
    private String name;

    public Student(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " nhận được thông báo: " + message);
    }
}
