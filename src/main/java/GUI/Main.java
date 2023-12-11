package GUI;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Component> components = new ArrayList<>();
        //Create the Windows component
        ComponentFactory componentFactory =  Windows.getInstance();
        Component frameWindows = componentFactory.createFrame("aouzal");
        //Add the component to the list and add journal
        components.add(frameWindows);
        frameWindows.addJournal(new Journalisation());

        GUIHandler guiHandler = new GUIHandler(components);
        guiHandler.dessiner(frameWindows, new Position(2,3));
        guiHandler.dessiner(new Position(4,5));

    }
}
