package Abstract_factory;

public class Creator extends Vehicule{
    private Vehicule voiture;

    public Creator(Vehicule voiture) {
        this.voiture = voiture;
    }

    public Creator mark(String marque){
        voiture.setMark(marque);
        return this;
    }

    public Creator model(String model){
        voiture.setModel(model);
        return this;
    }

    public Creator matricule(long matricule){
        voiture.setMatricule(matricule);
        return this;
    }

    public Creator nombrePorte(int porte){
        voiture.setNombreDePorte(porte);
        return this;
    }

    public Creator puissance(int puissance){
        voiture.setPuissance(puissance);
        return this;
    }

    public Creator motorisation(Motorisation motorisation){
        voiture.setMotorisation(motorisation);
        return this;
    }
    public Creator type(Type type){
        voiture.setType(type);
        return this;
    }

    public Vehicule Build(){
        return this.voiture;
    }




}
