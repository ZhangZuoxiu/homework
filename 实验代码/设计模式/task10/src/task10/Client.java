package task10;

public class Client {
  public static void main(String []args)
  {
	  AbstractFile obj1,obj2,obj3,obj4,obj5,obj6;
	 Folder f1,f2,f3;
	  obj1=new ImageFile("美女.jpg");
	  obj2=new ImageFile("萌宠.jpg");
	  obj3=new TextFile("1.txt");
	  obj4=new TextFile("2.txt");
	  obj5=new VideoFile("1.mp4");
	  obj6=new VideoFile("2.mp4");
	  
	  
	   f1=new Folder("图片");
	   f1.add(obj1);
	   f1.add(obj2);
	   f1.display();
	   
	   f2=new Folder("文本");
	   f2.add(obj3);
	   f2.add(obj4);
	   f2.display();
	   
	   f3=new Folder("图片");
	   f3.add(obj5);
	   f3.add(obj6);
	   f3.display();
	   
	   
  }
}
