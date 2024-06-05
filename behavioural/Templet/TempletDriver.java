package behavioural.Templet;

public class TempletDriver {
    public TempletDriver(){
        Datamining jsonDatamining=new JsonMinming();
        jsonDatamining.mine();

        Datamining XMLDataMining=new JsonMinming();
        XMLDataMining.mine();


    }
}
