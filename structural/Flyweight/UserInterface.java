package structural.Flyweight;

public class UserInterface {
    public UserInterface(){

        TextEditor textEditor=new Notion();
        textEditor .write(0,0,'a');
        textEditor .write(0,1,'b');


        textEditor.read();

    }
}
