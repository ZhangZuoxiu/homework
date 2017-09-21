package task20;

public class Cilent {
  public static void main(String []args)
  {
	  UserInfoDTO user=new UserInfoDTO();
	  Caretaker c=new Caretaker();
	  
	  user.setAccount("q");
	  user.setPassword("1");
	  user.setTelNo("1");
	  System.out.println("状态一：");
	  user.show();
	  c.setMemento(user.saveMemento());
	  System.out.println("\t");
	  
	  user.setAccount("w");
	  user.setPassword("2");
	  user.setTelNo("3");
	  System.out.println("状态二：");
	  user.show();
	  c.setMemento(user.saveMemento());
	  System.out.println("\t");
	  
	  user.setAccount("e");
	  user.setPassword("3");
	  user.setTelNo("3");
	  System.out.println("状态三：");
	  user.show();
	  c.setMemento(user.saveMemento());
	  System.out.println("\t");
	  
	  user.setAccount("r");
	  user.setPassword("4");
	  user.setTelNo("4");
	  System.out.println("状态四：");
	  user.show();
	  c.setMemento(user.saveMemento());
	  System.out.println("\t");
	  
	  user.restoreMemento(c.getMemento());
	  System.out.println("回到状态三：");
	  user.show();
	  System.out.println("\t");
	  
	  user.restoreMemento(c.getMemento());
	  System.out.println("回到状态二：");
	  user.show();
	  System.out.println("\t");;
	  
  }
}
