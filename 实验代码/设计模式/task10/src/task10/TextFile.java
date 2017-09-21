package task10;

public class TextFile extends AbstractFile{
	public  String fileName;
  TextFile(String fileName)
  {
	 this.fileName=fileName;
  }
  public void add(AbstractFile element)
  {
	  System.out.println("Ìí¼Ó£¬´íÎó²Ù×÷£¡");
  }
  public void remove(AbstractFile element){
  	System.out.println("ÒÆ³ý£¡´íÎó²Ù×÷£¡");
  }
 public void display()
 {
	   System.out.println(fileName+"");
 }
}
