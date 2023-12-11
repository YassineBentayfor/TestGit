package momento;

public class Main {
    public static void main(String [] args){
        var editor = new Editor();
        var history = new History();
        editor.setContent("e");
        history.pushState(editor.createState());
        editor.setContent("zsdvs");
        history.pushState(editor.createState());
        editor.setContent("eazertyuiocvnjkldfhjk");
        history.popState();


    }
}
