package users;

import events.Event;

public class Manager extends User {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void update(Event event) {
        System.out.println("Менеджер " + name + " получил уведомление:");
        email.send(event.getMessage());
        push.send(event.getMessage());
    }
}
