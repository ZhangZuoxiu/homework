package task11;

public class JarPhone extends PhoneDecorator{
   public  JarPhone(Phone phone){
	   super(phone);
   }
   public void display()
   {    
	   super.display();
	   System.out.println("’Ò∂ØÃ·–—°£");
   }
}
