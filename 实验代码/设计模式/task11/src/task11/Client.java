package task11;

public class Client {
  public static void main(String []args)
  {
	  Phone phone1,phone2,phone3;
	  System.out.println("�����ѣ�");
	  phone1=new SimplePhone();
	  phone1.display();
	  phone2=new JarPhone(phone1);
	  System.out.println("�������ѣ�");
	  phone2.display();
	  phone3=new ComplexPhone(phone2);
	  System.out.println("���������ѣ�");
	  phone3.display();
  }
}
