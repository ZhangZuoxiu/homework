package task10;

public class ImageFile extends AbstractFile{
  public String name; 
   ImageFile(String fileName){
	  this.name=fileName;
  }
  public void  add(AbstractFile element){
	  System.out.println("在图片中无法执行添加操作！");
	 
  }
  public void remove(AbstractFile element)
  {
	  System.out.println("移除，错误操作！");
  }
  public void display(){
	  System.out.println(name+" ");
  }
}

