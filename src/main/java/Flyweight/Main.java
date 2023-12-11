package Flyweight;

public class Main {
    public static void main(String[] agrs){
        var service = new PointService(new PointIconFactory());
        for( var point : service.getPoints())
            point.draw();
    }
}
