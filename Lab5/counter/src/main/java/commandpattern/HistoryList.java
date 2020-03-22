package commandpattern;

import java.util.ArrayList;
import java.util.List;

public class HistoryList {
    private List<Command> commandList = new ArrayList<>();
    private List<Command> undoCommandList = new ArrayList<>();

    public void undo(){
        if(commandList.size() > 0){
            Command current = commandList.get(commandList.size() - 1);
            undoCommandList.add(current);
            current.unExecute();
            commandList.remove(current);
        }
    }

    public void redo(){
        if(undoCommandList.size() > 0){
            Command current = undoCommandList.get(undoCommandList.size() - 1);
            undoCommandList.remove(current);
            current.execute();
            commandList.add(current);
        }
    }

    public void addCommand(Command command){
        commandList.add(command);
    }

    public List<Command> getCommandList() {
        return commandList;
    }
}
