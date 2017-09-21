package task22;

public class Client {
  public static void main(String args[])
  {
	  Account acc=new Account("ะกร๗",5.0);
	  acc.deposit(100);
	  acc.withdraw(200);
	  acc.deposit(1000);
	  acc.withdraw(2000);
	  acc.withdraw(100);
  }
}
