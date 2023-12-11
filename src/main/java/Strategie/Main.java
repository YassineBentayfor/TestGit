package Strategie;

import Strategie.better.RubberDuck;

public class Main {

    public static void main(String [] args){
        Transport transport = new TransportAir();
        Cargo cargo = new Cargo(transport);
        cargo.cost();
    }
}
