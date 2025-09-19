package structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternDriver {
    public CompositePatternDriver(){
        File file1=new File("file1");
        File file2=new File("file2");
        File file3=new File("file3");
        List<FilesSystem> children1= new ArrayList<>();
        children1.add(file1);

        List<FilesSystem> children2= new ArrayList<>();
        children2.add(file2);
        children2.add(file3);




        FilesSystem folder1=new Folder(children1, "folder1");
        children2.add(folder1);
        FilesSystem folder2=new Folder(children2, "folder2");

        folder2.render();
        /*
        he key part is that both File (leaf) and Directory 
        (composite) share the same interface and the client treats them uniformly.

        */

    }

}
