package bank.commanpattern;

import java.util.ArrayList;
import java.util.List;

public class HistoryList {
    List<Command> commandList = new ArrayList<>();
    List<Command> undoCommandList = new ArrayList<>();

    public void undo(){
        if(commandList.size() > 0){
            Command current = commandList.get(commandList.size() -1);
            commandList.remove(current);
            current.unExecute();
            undoCommandList.add(current);
        }
    }

    public void redo(){
        if(undoCommandList.size() > 0){
            Command current = undoCommandList.get(undoCommandList.size() -1);
            undoCommandList.remove(current);
            current.execute();
            commandList.add(current);
        }

    }

    public void addCommand(Command command){
        commandList.add(command);
    }
}
