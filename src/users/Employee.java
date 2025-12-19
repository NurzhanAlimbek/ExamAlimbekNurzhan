package users;

import events.Event;

public class Employee extends User {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void update(Event event) {
        System.out.println("Сотрудник " + name + " получил уведомление:");
        inApp.show(event.getMessage());
    }
}
