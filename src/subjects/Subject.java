package subjects;

import observers.Observer;
import events.Event;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Event event);
}
