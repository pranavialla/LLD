package behavioural.CommandPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Remote {
    Command command;

    Stack<Command> commandsExecuted = new Stack<Command>();
    Stack<Command> commandsRedoed=new Stack<Command>();

    public void sett(Command command){
        this.command=command;
    }

    public void execute(){
        command.execute();
        commandsExecuted.add(command);
    }

    public void undo(){
        if (commandsExecuted.size()!=0){
            Command undoCommand=commandsExecuted.pop();
            undoCommand.undo();
            commandsRedoed.add(undoCommand);
        }

    }

    public  void  redo(Command command){
        if (commandsRedoed.size()!=0){
            Command redoCommand=commandsRedoed.pop();
            redoCommand.redo();
            commandsExecuted.add(redoCommand);
        }

    }
}
