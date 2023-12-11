package Decorator;

public class CloudStream implements Stream{

    private Stream stream;
    public CloudStream(){
    }

    public CloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data){
        System.out.println(data);
        System.out.println("Storing "+ data);

    }
}
