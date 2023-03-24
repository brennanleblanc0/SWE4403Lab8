package ca.brennanleblanc.SWE4403Lab8.E01;

public class UndoCommand extends Command {
    public UndoCommand(VideoEditor editor, Application app) {
        super(editor, app);
    }

    @Override
    public boolean execute() {
        app.undo();
        return false;
    }
}
