package behavioural.momento;

import java.util.Stack;

public class HistorySaver {
    Stack<Git> gitHistory = new Stack<>();
    Stack<Git> UndoHistory = new Stack<>();

    Git git;

    public void HistorySaver(Git git) {
        this.git = git;
    }
    public void CommitAndPush(Git git) {
        gitHistory.push(git);
    }

    public Git revertChange(){
        if (gitHistory.size()!=0){
            System.out.println("gitHistory size + " + gitHistory.size());
            System.out.println("gitHistory  : " + gitHistory.peek().toString());
            System.out.println("gitHistory  : " + gitHistory.get(0).toString());
            System.out.println("gitHistory  : " + gitHistory.get(1).toString());
            Git revertedChange = gitHistory.pop();
            UndoHistory.push(revertedChange);
            if (gitHistory.size()!=0){
                System.out.println("gitHistory size + " + gitHistory.size());
                return gitHistory.peek();
            }
            return null;
        }
        return null;
    }


}
