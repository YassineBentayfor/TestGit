package Builder;

import javax.swing.text.StyledEditorKit;

public class CarBuilder implements Builder{
    private Car car;



    @Override
    public void reset() {
        this.car = new Car();

    }

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(Boolean t) {
        this.car.setTripComputer(t);
    }

    @Override
    public void setGPS(Boolean t) {
        this.car.setGPS(t);

    }

    public Car build(){
        var product = this.car;
        this.reset();
        return product;
    }
}
