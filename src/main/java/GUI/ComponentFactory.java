package GUI;

public abstract class ComponentFactory {

    public abstract Component createFrame(String nom);

    public abstract Component createButton();
    public abstract Component createCheckBox();
}
