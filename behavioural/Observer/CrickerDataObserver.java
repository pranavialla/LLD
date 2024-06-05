package behavioural.Observer;



public class CrickerDataObserver {
    private int runs;
    private int wickets;
    private float overs;

    public void update(int runs, int wickets, float overs) {
        this.wickets= wickets;
        this.runs= runs;
        this.overs= overs;
        display();
    }

    void display(){
        System.out.println("Runs: "+runs+" Wickets: "+wickets+" Overs: "+overs);
    }
}
