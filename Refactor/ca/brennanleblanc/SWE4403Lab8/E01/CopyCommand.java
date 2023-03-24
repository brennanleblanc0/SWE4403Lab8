package ca.brennanleblanc.SWE4403Lab8.E01;

public class CopyCommand extends Command {
    public CopyCommand(VideoEditor editor, Application app) {
        super(editor, app);
    }

    @Override
    public boolean execute() {
        app.setClipboard(editor.getText());
        return false;
    }
}
