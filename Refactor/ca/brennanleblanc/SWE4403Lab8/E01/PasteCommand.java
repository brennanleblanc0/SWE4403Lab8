package ca.brennanleblanc.SWE4403Lab8.E01;

public class PasteCommand extends Command {
    public PasteCommand(VideoEditor editor, Application app) {
        super(editor, app);
    }

    @Override
    public boolean execute() {
        saveBackup();
        editor.setText(app.getClipboard());
        return true;
    }
}
