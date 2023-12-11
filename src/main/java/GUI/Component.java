package GUI;

import java.util.ArrayList;
import java.util.List;

public abstract class Component implements Publiser{
    public List<Journalisation> journalisations = new ArrayList<>();
    private String nom;
    private String taille;
    private Position position;

    public Component(String nom) {
        this.nom = nom;
    }

    public List<Journalisation> getJournalisations() {
        return journalisations;
    }

    public String getNom() {
        return nom;
    }

    public String getTaille() {
        return taille;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public void addJournal(Journalisation journalisation) {
        journalisations.add(journalisation);
    }

    @Override
    public void removeJournal(Journalisation journalisation) {
        journalisations.remove(journalisation);
    }

    public void notifyJournals(){
        System.out.println("eedede");
        for(Journalisation journalisation : journalisations){
            journalisation.update(this.getNom(), this.getClass().getName(), this.getPosition());
        }
    }

    public void position(Position point) {
        this.setPosition(point);
        this.notifyJournals();
        System.out.println("ee");
    }















    public void setJournalisations(List<Journalisation> journalisations) {
        this.journalisations = journalisations;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
