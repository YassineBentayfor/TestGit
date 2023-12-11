package Decorator.message;

import javax.sound.midi.Soundbank;

public class SMS extends NotificationPerso{
    public SMS(Notification notification) {
        super(notification);
    }
    @Override
    public void sendMessage(String data){
        super.sendMessage(" SMS ..."+ data);
    }
}
