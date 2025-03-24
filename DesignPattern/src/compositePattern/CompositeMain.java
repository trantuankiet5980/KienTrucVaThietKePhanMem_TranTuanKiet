package compositePattern;

public class CompositeMain {
    public static void main(String[] args) {
        FileSystemComponent f1 = new File("Document1.txt");
        FileSystemComponent f2 = new File("Document2.txt");

        Folder root = new Folder("root");
        Folder sub = new Folder("subforlder");

        File f3 = new File("Document3.txt");


        sub.add(f1);
        root.add(sub);
        root.add(f2);
        root.add(f3);

        root.showInfo();



    }
}
