package task10;

public class TextFile extends AbstractFile{
	public  String fileName;
  TextFile(String fileName)
  {
	 this.fileName=fileName;
  }
  public void add(AbstractFile element)
  {
	  System.out.println("��ӣ����������");
  }
  public void remove(AbstractFile element){
  	System.out.println("�Ƴ������������");
  }
 public void display()
 {
	   System.out.println(fileName+"");
 }
}
