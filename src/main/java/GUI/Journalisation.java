package GUI;

public class Journalisation implements Subscriber{
    @Override
    public void update(String nom, String type, Position position) {
        System.out.println(nom + type + position);
        System.out.println("eeeee");
    }

}
