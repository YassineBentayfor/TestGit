package Liskov;

public class Carre{
    Rectangle rectangle;
    public void setCarre(int larger) {
        rectangle.setLarger(larger);
        rectangle.setLongueur(larger);
    }


    public int getSurface() {
        return rectangle.getSurface();
    }
}
