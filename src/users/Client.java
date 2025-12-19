package users;

import events.Event;

public class Client extends User {

    public Client(String name) {
        super(name);
    }

    @Override
    public void update(Event event) {
        System.out.println("Клиент " + name + " получил уведомление:");
        email.send(event.getMessage());
    }
}
