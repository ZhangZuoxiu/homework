package task25;

public class Dabao extends Visitor
{
	public void visit(Apple apple)
	{
		System.out.println("���Ա" + name + "��ƻ�������");
	}
	
	public void visit(Book book)
	{
		System.out.println("���Ա" + name + "������");
	}
}
