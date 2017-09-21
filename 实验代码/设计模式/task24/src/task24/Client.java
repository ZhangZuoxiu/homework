package task24;

abstract class DBOperator
{
	public abstract void connDB();
	public void openDB()
	{
		System.out.println("打开数据库");
	}
	public void useDB()
	{
		System.out.println("使用数据库");
	}
	public void closeDB()
	{
		System.out.println("关闭数据库");
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
		System.out.println("使用JDBD连接SQL SERVER 数据库");
	}
}

class Orcale extends DBOperator
{
	public void connDB()
	{
		System.out.println("使用.....连接Oracle 数据库");
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
