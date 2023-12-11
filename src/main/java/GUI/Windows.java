package GUI;

public class Windows extends ComponentFactory{
    public static Windows instance;
    private Windows(){}

    public static Windows getInstance() {
        if(instance == null) instance = new Windows();
        return instance;
    }



    @Override
    public Component createFrame(String nom) {
        return new FrameWindows(nom);
    }

    @Override
    public Component createButton() {
        return null;
    }

    @Override
    public Component createCheckBox() {
        return null;
    }



}
