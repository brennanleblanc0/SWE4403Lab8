package ca.brennanleblanc.SWE4403Lab8.E01;

public class DeleteCommand extends Command {
    public DeleteCommand(VideoEditor editor, Application app) {
        super(editor, app);
    }

    @Override
    public boolean execute() {
        saveBackup();
        editor.removeText();
        return true;
    }
}
