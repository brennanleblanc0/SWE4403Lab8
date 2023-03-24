package ca.brennanleblanc.SWE4403Lab8.E01;

public class Application {
    private CommandHistory history;
    private String clipboard;
    

    public Application() {
        history = new CommandHistory();
        clipboard = "";
    }

    public void undo() {
        Command pop = history.pop();

        if (pop != null) {
            pop.undo();
        }
    }

    public void executeCommand(Command c) {
        if (c.execute()) {
            history.push(c);
        }
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }
}
