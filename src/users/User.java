package users;

import observers.Observer;
import events.Event;
import notifications.*;

public abstract class User implements Observer {

    protected String name;
    protected EmailNotification email = new EmailNotification();
    protected PushNotification push = new PushNotification();
    protected InAppNotification inApp = new InAppNotification();

    public User(String name) {
        this.name = name;
    }
}
