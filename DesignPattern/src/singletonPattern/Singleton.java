package singletonPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if( instance == null) instance = new Singleton();
        return instance;
    }

    public void loadConfig(){
        System.out.println("hello-word");
    }

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.loadConfig();
    }
}
