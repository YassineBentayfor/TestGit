package Abstract_factory;

public class DieselVehiculeFactory implements Factory {
    @Override
    public Vehicule createVehicule() {
        Creator carBuilder = new Creator(new Vehicule());
        carBuilder.setMotorisation(Vehicule.Motorisation.DIESEL);
        return carBuilder.Build();
    }
}