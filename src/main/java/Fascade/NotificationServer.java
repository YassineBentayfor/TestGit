package Fascade;

public class NotificationServer {
    public Connection connect(String ipAdress){
        return new Connection();
    }
    public AuthToken authicate(String appID, String key){
        return new AuthToken();
    }
    public void send(AuthToken authToken, Message message, String  target){
        System.out.println("Sedning Message");
    }
}
