public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        Command insert = new InsertCommand(editor, "Hello World", 0);
        app.executeCommand(insert);

        System.out.println(editor.getText());

        Command delete = new DeleteCommand(editor, 5, 11);
        app.executeCommand(delete);

        System.out.println(editor.getText());

        app.undo();

        System.out.println(editor.getText());
    }
}