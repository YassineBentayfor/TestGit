package Decorator.message;

public class NotificationPerso implements Notification{
    Notification notification;

    public NotificationPerso(){

    }
    public NotificationPerso(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendMessage(String data) {
        this.notification.sendMessage(data);
    }
}
