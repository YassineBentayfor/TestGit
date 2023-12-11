package Decorator.message;

public class NotificationEmail implements Notification{
    @Override
    public void sendMessage(String data) {
        System.out.println("EMAIL ..." + data);
    }
}
