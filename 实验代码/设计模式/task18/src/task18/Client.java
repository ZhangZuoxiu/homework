package task18;
import java.util.Collection;
import java.util.Vector;
import javax.swing.text.html.HTMLDocument.Iterator;
class  student
{
	public String name;
	public String num;
	public int age;
	
	public student(String name,String num,int age)
	{
		this.name=name;
		this.num=num;
		this.age=age;
	}
	}
class ouput
{
	Collection<student> student=new Vector<student>();
	public ouput()
	{
		student s1=new student("q","1",18);
		student.add(s1);
		student s2=new student("w","2",18);
		student.add(s2);
		student s3=new student("e","3",18);
		student.add(s3);
	}
	public java.util.Iterator<student> create()
	{
		return student.iterator();
	}
	
}
public class Client {
    public static void main(String []args)
    {
    	ouput o=new ouput();
    	java.util.Iterator<student> i=o.create();
    	while(i.hasNext())
    	{
    		student s=i.next();
    		{
    			System.out.println("ĞÕÃû£º"+s.name);
    			System.out.println("Ñ§ºÅ£º"+s.num);
    		    System.out.println("ÄêÁä£º"+s.age);
    		    System.out.println("\t");
    		}
    	}
    }
}
