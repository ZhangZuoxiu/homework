package task11;

public class Client {
  public static void main(String []args)
  {
	  Phone phone1,phone2,phone3;
	  System.out.println("简单提醒：");
	  phone1=new SimplePhone();
	  phone1.display();
	  phone2=new JarPhone(phone1);
	  System.out.println("复杂提醒：");
	  phone2.display();
	  phone3=new ComplexPhone(phone2);
	  System.out.println("更复杂提醒：");
	  phone3.display();
  }
}
