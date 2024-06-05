package behavioural.CommandPattern;

public interface Command {
    void execute();
    void undo();
    void redo();
}
