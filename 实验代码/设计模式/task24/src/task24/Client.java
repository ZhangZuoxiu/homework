package task24;

abstract class DBOperator
{
	public abstract void connDB();
	public void openDB()
	{
		System.out.println("�����ݿ�");
	}
	public void useDB()
	{
		System.out.println("ʹ�����ݿ�");
	}
	public void closeDB()
	{
		System.out.println("�ر����ݿ�");
	}
	public void process()
	{
		connDB();
		openDB();
		useDB();
		closeDB();
		
	}
}
class SQL extends DBOperator

{
	public void connDB()
	{
		System.out.println("ʹ��JDBD����SQL SERVER ���ݿ�");
	}
}

class Orcale extends DBOperator
{
	public void connDB()
	{
		System.out.println("ʹ��.....����Oracle ���ݿ�");
	}
	}
public class Client {
	public static void main(String args[])
	{
  DBOperator db;
  db=new SQL();
  db.process();
  System.out.println("-------------------------------------");
  db=new Orcale();
  db.process();
	}
}
