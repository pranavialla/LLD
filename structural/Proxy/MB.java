package structural.Proxy;

public class MB implements Client{
    Server tekion;

    public MB(){
        tekion = new TekionProxy();
    }
    public void callTekion() {
        System.out.println("request initiated   ");
        tekion.call("new headers request");
    }
}
