import definition.ConcreteObserver;
import definition.Subject;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer nr 1");        
        ConcreteObserver observer2 = new ConcreteObserver("Observer nr 2");

        subject.addObserver(observer1);        
        subject.addObserver(observer2);
        System.out.println("System message: added observer1, observer2 ");

        subject.notifyObservers("Message to All Observers: Hello!");       

        subject.removeObserver(observer2);
        System.out.println("System message: removed observer2 ");
        subject.notifyObservers("Message to All Observers: Observer nr 2 has been removed.");
    }
}
