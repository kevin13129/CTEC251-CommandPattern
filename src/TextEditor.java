public class TextEditor {

    private StringBuilder text = new StringBuilder();

    public void insertText(int position, String newText) {
        text.insert(position, newText);
    }

    public String getText() {
        return text.toString();
    }
}