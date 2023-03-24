package ca.brennanleblanc.SWE4403Lab8.E01;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<Command> history =  new ArrayList<>();

    public void push(Command c) {
        history.add(c);
    }

    public Command pop() {
        int length = history.size();
        if (length > 0) {
            Command temp = history.get(length - 1);
            history.remove(length - 1);
            return temp;
        } else {
            return null;
        }
    }
}
