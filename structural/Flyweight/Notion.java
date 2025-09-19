package structural.Flyweight;

public class Notion implements TextEditor{
    Object[][] page;
    Flyweight flyweight;

    Notion(){
        page = new Object[100][100];
        // Use the shared flyweight instance
        flyweight = Flyweight.getInstance();
    }
    @Override
    public void write(int xAxis, int yAxis, char character) {

        page[xAxis][yAxis]=flyweight.getObjectRefForACharacter(character);
    }

    public void read(){
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if (page[i][j]!=null){
                    System.out.print((char) page[i][j]);
                }
            }
            System.out.println();
        }
    }
}
