package behavioural.Templet;

public abstract class Datamining {

    public void openFile(){
        System.out.println("open file");
    }
    public void closeFile(){
        System.out.println("closing file");
    }

    public abstract void readFile();
    public final void mine(){
        openFile();
        readFile();
        closeFile();
    }
}
