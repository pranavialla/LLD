package structural.Adapter;

public class MP3Adapter implements MP3Adaptee{
    AdvanceMp advanceMp;
    MP3Adapter(String adapter){
        if (adapter.equals("MP4")){
            this.advanceMp = new MP4();
        }
        else if (adapter.equals("MP5")){
            this.advanceMp = new MP5();
        }
        else{
            System.out.println("not supported");
        }
    }

    @Override
    public String playMusic() {
        return  advanceMp.playMusicc()+ " adapted";
    }
}
