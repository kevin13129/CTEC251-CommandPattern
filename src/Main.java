import java.util.List;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        Command header = new InsertCommand(editor, "HEADER", 0);
        Command newline = new InsertCommand(editor, "\n", 6);
        Command footer = new InsertCommand(editor, "FOOTER", 7);

        MacroCommand template = new MacroCommand(
                List.of(header, newline, footer)
        );

        app.executeCommand(template);

        System.out.println(editor.getText());

        app.undo();

        System.out.println(editor.getText());
    }
}