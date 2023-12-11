package Liskov;

public class Rectangle {
    private int longueur;
    private int larger;


    public void setLarger(int larger){
        this.larger = larger;
    }
    public void setLongueur(int longueur){
        this.longueur = longueur;
    }

    public int getSurface(){
        return this.larger * this.longueur;
    }

    @Override
    public String toString() {
        return "longueur=" + longueur +
                ", largeur=" + larger;
    }
}
