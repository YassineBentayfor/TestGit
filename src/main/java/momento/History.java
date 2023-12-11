package momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorState> states = new ArrayList<>();

    public void pushState(EditorState state){
        states.add(state);
    }

    public EditorState popState() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        states.remove(lastState);
        return lastState;
    }
}
