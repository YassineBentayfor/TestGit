package Strategie;

public class Cargo {
    private Transport transport;

    public Cargo(Transport transport) {
        this.transport = transport;
    }

    public double cost(){
        return this.transport.cost(this);
    }
}
