package behavioural.Observer;



public class CrickerDataObserver {
    public int runs;
    public int wickets;
    public float overs;

    public void update(int runs, int wickets, float overs) {
        this.wickets= wickets;
        this.runs= runs;
        this.overs= overs;
        display();
    }

    public void display(){
        System.out.println("Runs: "+runs+" Wickets: "+wickets+" Overs: "+overs);
    }
}
