package task20;

public class Cilent {
  public static void main(String []args)
  {
	  UserInfoDTO user=new UserInfoDTO();
	  Caretaker c=new Caretaker();
	  
	  user.setAccount("q");
	  user.setPassword("1");
	  user.setTelNo("1");
	  System.out.println("״̬һ��");
	  user.show();
	  c.setMemento(user.saveMemento());
	  System.out.println("\t");
	  
	  user.setAccount("w");
	  user.setPassword("2");
	  user.setTelNo("3");
	  System.out.println("״̬����");
	  user.show();
	  c.setMemento(user.saveMemento());
	  System.out.println("\t");
	  
	  user.setAccount("e");
	  user.setPassword("3");
	  user.setTelNo("3");
	  System.out.println("״̬����");
	  user.show();
	  c.setMemento(user.saveMemento());
	  System.out.println("\t");
	  
	  user.setAccount("r");
	  user.setPassword("4");
	  user.setTelNo("4");
	  System.out.println("״̬�ģ�");
	  user.show();
	  c.setMemento(user.saveMemento());
	  System.out.println("\t");
	  
	  user.restoreMemento(c.getMemento());
	  System.out.println("�ص�״̬����");
	  user.show();
	  System.out.println("\t");
	  
	  user.restoreMemento(c.getMemento());
	  System.out.println("�ص�״̬����");
	  user.show();
	  System.out.println("\t");;
	  
  }
}
