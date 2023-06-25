package patterns.behavioral.command;

public class PasteCommand implements Command {

    private TextEditor receiver;

    PasteCommand(TextEditor receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.paste();
    }
}
