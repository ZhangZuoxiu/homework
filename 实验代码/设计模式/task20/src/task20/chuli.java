package task20;

import java.util.ArrayList;
class UserInfoDTO
{
	private String account;
	private String password;
	private String telNo;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public Memento saveMemento()
	{
		return new Memento(account,password,telNo);
				
	}
	public void restoreMemento(Memento memento)
	{
		this.account=memento.getAccount();
		this.password=memento.getPassword();
		this.telNo=memento.getTelNo();
	}
	void show()
	{
		System.out.println("Account:"+this.account);
		System.out.println("Password:"+this.password);
		System.out.println("TelNo:"+this.telNo);
	}
}

class Caretaker
{
 private ArrayList<Memento> memento=new ArrayList<Memento>();
 public Memento getMemento()
 {
	 if(memento.size()-2>0)
	 {
        Memento m=memento.get(memento.size()-2);
        memento.remove(m);
        return m;
      }
	 else
	 {
		 System.out.println("Ã»ÓÐ±¸ÍüÂ¼");
		 return null;
		 }
	 }
 public void setMemento(Memento memento)
 {
	 this.memento.add(memento);
 }
}

class Memento
{
	private String account;
	private String password;
	private String telNo;
	public Memento(String account,String password,String telNo)
	{
		this.account=account;
		this.password=password;
		this.telNo=telNo;
		
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
}
public class chuli {

}
