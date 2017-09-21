package task10;

public class VideoFile extends AbstractFile {
    public  String filename;
     VideoFile(String fileName){
    	this.filename=fileName;
    }
    public void add(AbstractFile element){
    	System.out.println("Ìí¼Ó,´íÎó²Ù×÷£¡");
    }
    public void remove(AbstractFile element){
    	System.out.println("ÒÆ³ý,´íÎó²Ù×÷£¡");
    }
   public void display()
   {
	   System.out.println(filename+" ");
   }
}
