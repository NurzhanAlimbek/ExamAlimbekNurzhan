package events;

public class DocumentUpdatedEvent extends Event {
    public DocumentUpdatedEvent(String documentName) {
        this.message = "Документ обновлён: " + documentName;
    }
}
