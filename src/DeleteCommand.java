public class DeleteCommand implements Command {

    private TextEditor editor;
    private int start;
    private int end;
    private String deletedText;

    public DeleteCommand(TextEditor editor, int start, int end) {
        this.editor = editor;
        this.start = start;
        this.end = end;
    }

    public void execute() {
        deletedText = editor.getText().substring(start, end);
        editor.deleteText(start, end);
    }

    public void undo() {
        editor.insertText(start, deletedText);
    }
}