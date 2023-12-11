package Decorator;

public class EncryptedCloudStream implements Stream{
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data){
        var encrypted = encrypt(data);
        System.out.println(
                data
        );
        stream.write(encrypted);

    }
    private String encrypt(String data){
        return "a-zrt_yar";

    }
}
