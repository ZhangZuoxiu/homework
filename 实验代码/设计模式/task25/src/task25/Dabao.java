package task25;

public class Dabao extends Visitor
{
	public void visit(Apple apple)
	{
		System.out.println("打包员" + name + "给苹果打包。");
	}
	
	public void visit(Book book)
	{
		System.out.println("打包员" + name + "给书打包");
	}
}
