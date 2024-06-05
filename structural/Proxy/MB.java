package structural.Proxy;

public class MB implements Client{
    Server tekion;

    public MB(){
        tekion=new Tekion();
    }
    @Override
    public void addAuthHeaders(String token) {
        System.out.println("Based on token added headers");
        tekion.call("new headers request");
    }


    public void callTekion() {
        System.out.println("request initiated   ");

        addAuthHeaders("1232");
    }
}
