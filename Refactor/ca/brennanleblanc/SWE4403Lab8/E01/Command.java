package ca.brennanleblanc.SWE4403Lab8.E01;

public abstract class Command {
    protected VideoEditor editor;
    protected Application app;
    private String backupText;
    private float backupContrast;

    public Command(VideoEditor editor, Application app) {
        this.editor = editor;
        this.app = app;
    }

    public void saveBackup() {
        backupText = editor.getText();
        backupContrast = editor.getContrast();
    }

    public void undo() {
        editor.setText(backupText);
        editor.setContrast(backupContrast);
    }

    public abstract boolean execute();
}
