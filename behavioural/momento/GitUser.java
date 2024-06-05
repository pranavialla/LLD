package behavioural.momento;

public class GitUser {
    public GitUser(){
        System.out.println("I am a git user");
        Git apranvi=new Git("apranavi");
        HistorySaver gitdb=new HistorySaver();
        apranvi.setCommitID("2");
        apranvi.setDescription("description");
        apranvi.setData("data code");


        Git currentState = apranvi.capture();
        System.out.println(apranvi.toString());
        gitdb.CommitAndPush(currentState);

        apranvi.setData("data code v2");
        Git currentState2=apranvi.capture();
        System.out.println(apranvi.toString());
        gitdb.CommitAndPush(currentState2);


        apranvi.setGit(gitdb.revertChange());
        System.out.println(apranvi.toString());





    }
}
