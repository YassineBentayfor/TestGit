package GUI;

import java.util.List;

public class GUIHandler {
    List<Component> components;
    ComponentFactory cf;


    public GUIHandler() {
    }

    public GUIHandler(List<Component> components) {
        this.components = components;
    }



    public void dessiner(Component component, Position point){
        component.position(point);
    }

    public void dessiner(Position point){
        for( Component component : components){
            component.position(point);
        }
    }
}
