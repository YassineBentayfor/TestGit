package Builder;

public class CarManualBuilder implements Builder{
    Manual manual;



    @Override
    public void reset() {
        this.manual = new Manual();

    }

    @Override
    public void setSeats(int number) {
        this.manual.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(Boolean t) {
        this.manual.setTripComputer(t);
    }

    @Override
    public void setGPS(Boolean t) {
        this.manual.setGPS(t);

    }

    public Manual build(){
        var product = this.manual;
        this.reset();
        return product;
    }
}
