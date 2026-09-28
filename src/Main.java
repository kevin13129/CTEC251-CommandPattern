public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        Command one = new InsertCommand(editor, "Hello", 0);
        Command two = new InsertCommand(editor, " World", 5);
        Command three = new InsertCommand(editor, "!", 11);

        app.executeCommand(one);
        app.executeCommand(two);
        app.executeCommand(three);

        System.out.println(editor.getText());

        app.undo();
        System.out.println(editor.getText());

        app.undo();
        System.out.println(editor.getText());

        app.undo();
        System.out.println(editor.getText());
    }
}