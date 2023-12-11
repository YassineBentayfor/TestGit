package Decorator.message;

public class X extends NotificationPerso{
    public X(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage(String data){
        super.sendMessage(" X ..."+ data);

    }
}
