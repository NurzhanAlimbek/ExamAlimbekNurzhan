package events;

public class SystemNotificationEvent extends Event {
    public SystemNotificationEvent(String info) {
        this.message = "Системное уведомление: " + info;
    }
}
