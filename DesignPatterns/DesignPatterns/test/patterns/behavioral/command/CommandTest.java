package patterns.behavioral.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test
    void testExecute() {
        TextEditor editor = new TextEditor();
        editor.add("hello ");

        Command copy = new CopyCommand(editor);
        copy.execute();

        editor.add("ficow ");

        Command paste = new PasteCommand(editor);
        paste.execute();

        assertEquals("hello ficow hello", editor.getState());
    }
}