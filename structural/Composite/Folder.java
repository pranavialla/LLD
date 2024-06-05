package structural.Composite;

import java.util.List;

public class Folder implements FilesSystem {
    List<FilesSystem> children;
    String name;
    public Folder(List<FilesSystem> children, String name) {
        this.children=children;
        this.name=name;
    }

    public void add(FilesSystem c){
        children.add(c);
    }

    public void remove(FilesSystem c){
        children.remove(c);
    }

    @Override
    public void render() {
        for (FilesSystem c : children){
            System.out.println("render folder : "+this.name);
            c.render();
        }
    }
}
