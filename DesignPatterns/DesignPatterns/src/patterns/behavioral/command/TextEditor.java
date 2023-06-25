package patterns.behavioral.command;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class TextEditor {
    private StringBuilder buffer = new StringBuilder();

    public void copy() {
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable text = new StringSelection(buffer.toString());
        clip.setContents(text, null);
    }

    public void paste() {
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable clipContent = clip.getContents(null);
        if (clipContent == null) {
            return;
        }
        if (!clipContent.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String text = (String) clipContent.getTransferData(DataFlavor.stringFlavor);
            add(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void add(String s) { buffer.append(s); }

    public void delete() {
        if (buffer.length() == 0) { return; }
        buffer.deleteCharAt(buffer.length() - 1);
    }

    public String getState() { return buffer.toString(); }

}
