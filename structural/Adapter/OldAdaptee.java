package structural.Adapter;

public class OldAdaptee implements MP3Adaptee{
    MP3Adapter mp3Adapter;
    public OldAdaptee(String mpToAdapt){
        this.mp3Adapter = new MP3Adapter(mpToAdapt);
    }

    @Override
    public String playMusic() {
        System.out.println("play music through oldAdaptee");
        System.out.println("play : + " +mp3Adapter.playMusic());
        return null;
    }
}
