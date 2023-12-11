package Abstract_factory;

import java.util.Date;

public class Vehicule {
    private String mark;
    private String model;
    private long matricule;
    private int nombreDePorte;
    private int puissance;
    private Date anneeCirculation;
    public enum Motorisation{
        DIESEL,
        ELECTRIQUE,
        HYBRIDE
    }
    private Motorisation motorisation;
    public enum Type{
        QUATREXQUATRE,
        CROSSOVER
    }
    private Type type;



    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getMatricule() {
        return matricule;
    }

    public void setMatricule(long matricule) {
        this.matricule = matricule;
    }

    public int getNombreDePorte() {
        return nombreDePorte;
    }

    public void setNombreDePorte(int nombreDePorte) {
        this.nombreDePorte = nombreDePorte;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public Date getAnneeCirculation() {
        return anneeCirculation;
    }

    public void setAnneeCirculation(Date anneeCirculation) {
        this.anneeCirculation = anneeCirculation;
    }

    public Motorisation getMotorisation() {
        return motorisation;
    }

    public void setMotorisation(Motorisation motorisation) {
        this.motorisation = motorisation;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


}
