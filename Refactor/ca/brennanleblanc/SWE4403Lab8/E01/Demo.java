package ca.brennanleblanc.SWE4403Lab8.E01;

public class Demo {
    public static void main(String[] args) {
        Application app = new Application();
        
        VideoEditor editor = new VideoEditor();

        Command command = new PasteCommand(editor, app);
        app.setClipboard("Test");
        app.executeCommand(command);

        System.out.println(editor);

        command = new DeleteCommand(editor, app);
        app.executeCommand(command);

        System.out.println(editor);

        command = new UndoCommand(editor, app);
        app.executeCommand(command);

        System.out.println(editor);

        app.setClipboard("");
        System.out.println(app.getClipboard());
        
        command = new CopyCommand(editor, app);
        app.executeCommand(command);

        System.out.println(app.getClipboard());
    }
}
