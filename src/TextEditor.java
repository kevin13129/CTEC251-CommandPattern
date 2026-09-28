public class TextEditor {

    private StringBuilder text = new StringBuilder();

    public void insertText(int position, String newText) {
        text.insert(position, newText);
    }

    public void deleteText(int start, int end) {
        text.delete(start, end);
    }

    public String getText() {
        return text.toString();
    }
}