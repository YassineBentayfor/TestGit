package Builder;

public class Director {
    public void makeSUV(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("TOYOTA");
        builder.setTripComputer(Boolean.TRUE);
        builder.setGPS(Boolean.FALSE);

    }

    public void makeSports(Builder builder){
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("HONDA");
        builder.setTripComputer(Boolean.TRUE);
        builder.setGPS(Boolean.TRUE);
    }
}
