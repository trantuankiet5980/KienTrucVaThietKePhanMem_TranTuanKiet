package observerPattern.bai01;

import java.util.ArrayList;
import java.util.List;
public class ClassLeader implements Subject{
    private String message;
    private List<Observer> list;
    public ClassLeader() {
        list = new ArrayList<>();
    }
    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
