package Decorator;

public class Main {
    public static void main(String[] args){
        Stream e = (new EncryptedCloudStream( new CompressedCloudStream(new CloudStream())));
        e.write("123457");
    }

}
