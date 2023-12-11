package Builder;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer(Boolean t);
    void setGPS(Boolean t);

}
