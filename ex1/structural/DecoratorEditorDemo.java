interface TextEditor {
    void write(String text);
}

class SimpleEditor implements TextEditor {
    public void write(String text) { System.out.println("Writing: " + text); }
}

class SpellCheckDecorator implements TextEditor {
    private TextEditor editor;
    public SpellCheckDecorator(TextEditor editor) { this.editor = editor; }
    public void write(String text) {
        System.out.println("SpellCheck enabled");
        editor.write(text);
    }
}

class AutoSaveDecorator implements TextEditor {
    private TextEditor editor;
    public AutoSaveDecorator(TextEditor editor) { this.editor = editor; }
    public void write(String text) {
        editor.write(text);
        System.out.println("AutoSave after writing.");
    }
}

public class DecoratorEditorDemo {
    public static void main(String[] args) {
        TextEditor editor = new SpellCheckDecorator(new AutoSaveDecorator(new SimpleEditor()));
        editor.write("Hello world!");
    }
}