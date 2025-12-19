import subjects.EventManager;
import users.*;
import events.*;

public class Main {
    public static void main(String[] args) {

        EventManager eventManager = new EventManager();

        Manager manager = new Manager("Али");
        Employee employee = new Employee("Нур");
        Client client = new Client("Дана");

        eventManager.attach(manager);
        eventManager.attach(employee);
        eventManager.attach(client);

        eventManager.notifyObservers(
                new TaskStatusChangedEvent("Отчёт", "Выполнено")
        );

        System.out.println("Клиент отписался");
        eventManager.detach(client);

        eventManager.notifyObservers(
                new SystemNotificationEvent("Обновление системы сегодня в 22:00")
        );
    }
}
