package Decorator.message;

public class Main {
    public static void main(String[] args){
        Notification perso = new SMS(new X(new NotificationEmail()));
        perso.sendMessage("Yassine");

    }
}
