package task10;

import java.util.ArrayList;

public class Folder extends AbstractFile{
	 ArrayList<AbstractFile> fileList=new ArrayList<AbstractFile>();
    public  String name;
    Folder(String name)
    {
    	this.name=name;
    }
    public void add(AbstractFile element){
    	fileList.add(element);
    }
    public void remove(AbstractFile element)
    {
    	fileList.remove(element);
    }
    public void display()
    {System.out.println(name+"ÎÄ¼þÏÂ£º");
    	for(int i=0;i<fileList.size();i++)
    	{
    		AbstractFile a=(AbstractFile)fileList.get(i);
    		a.display();
    	}
 
    }   
}
