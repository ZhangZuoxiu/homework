package task10;

public class ImageFile extends AbstractFile{
  public String name; 
   ImageFile(String fileName){
	  this.name=fileName;
  }
  public void  add(AbstractFile element){
	  System.out.println("��ͼƬ���޷�ִ����Ӳ�����");
	 
  }
  public void remove(AbstractFile element)
  {
	  System.out.println("�Ƴ������������");
  }
  public void display(){
	  System.out.println(name+" ");
  }
}

