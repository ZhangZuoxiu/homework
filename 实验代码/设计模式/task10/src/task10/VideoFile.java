package task10;

public class VideoFile extends AbstractFile {
    public  String filename;
     VideoFile(String fileName){
    	this.filename=fileName;
    }
    public void add(AbstractFile element){
    	System.out.println("���,���������");
    }
    public void remove(AbstractFile element){
    	System.out.println("�Ƴ�,���������");
    }
   public void display()
   {
	   System.out.println(filename+" ");
   }
}
