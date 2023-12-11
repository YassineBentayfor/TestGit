package Builder;

public class Car {
    private int seats;
    private String engine;
    private Boolean tripComputer;
    private Boolean GPS;


    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Boolean getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(Boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Boolean getGPS() {
        return GPS;
    }

    public void setGPS(Boolean GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                '}';
    }
}
