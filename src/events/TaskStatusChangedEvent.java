package events;

public class TaskStatusChangedEvent extends Event {
    public TaskStatusChangedEvent(String taskName, String status) {
        this.message = "Статус задачи \"" + taskName + "\" изменён на: " + status;
    }
}
