package Liskov;

import java.util.ArrayList;
import java.util.List;

public class EditeurGraphique {
    public static void main(String[] args){
        //List<Rectangle> objGraphique = new ArrayList<>();
        Rectangle rectangle = new Rectangle();
        Carre carre = new Carre();

        rectangle.setLarger(2); rectangle.setLongueur(4);
        carre.setCarre(4);




        System.out.println(rectangle.getSurface());
        System.out.println(carre.getSurface());



    }
}
