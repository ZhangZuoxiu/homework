package task16;
import java.util.ArrayList;
abstract class AbstractCommand{
	public abstract int execute(int value);
	public abstract int  undo(); 
	public abstract int redo();
}

class Adder
{
	private int num=0;
	public int add(int value)
	{
		num+=value;
		return num;
	}
}
class ConcreteCommand extends AbstractCommand
{
	private Adder adder=new Adder();
	public ArrayList arr=new ArrayList();
	public int step=-1;
	public int sum=0;
	public int mark;
	private int value;
	public int execute(int value)
	{
		arr.add(value);
		step++;
		int num=(int)arr.get(step);
		sum=adder.add(num);
		mark=0;
		return sum;
	}
	
	public int undo()
	{
		int num=(int)arr.get(step);
		if(mark==0||mark==1)
		{
			sum=adder.add(-num);
			arr.remove(step);
			step--;
			mark=1;
		}
		else if(mark==2)
		{
			sum=redo();
			mark=1;
		}
		return sum;
	}
     public int redo()
     {
    	 int num=(int)arr.get(step);
    	 if(mark==0)
    	 {
    		 sum=execute(num);
    		 mark=2;
    	 }
    	 else if(mark==1)
    	 {
    		 sum=undo();
    		 mark=2;
    	 }
    	 else if(mark==2)
    	 {
    		return 0; 
    	 }
    	 return sum;
     }
}

class CalculatorForm
{
	private AbstractCommand command;
	
	public void setCommand(AbstractCommand command)
	{
		this.command=command;
	}
	public void compute(int value)
	{  
	   
		int jieguo=command.execute(value);
		
		System.out.println("执行运算结果："+jieguo);
	}
		public void undo()
		{
			int jieguo = 0;
		
			jieguo=command.undo();
				
		 System.out.println("执行运算结果："+jieguo);
		}
	
	public void redo()
	{
		int jieguo=command.redo();
		System.out.println("执行重复，结果为："+jieguo);		
	}
}
public class Client {
	public static void main(String []args)
	{
		
		CalculatorForm form = new CalculatorForm();
		ConcreteCommand command = new ConcreteCommand();
		form.setCommand(command);
		form.compute(10);
		form.compute(5);
		form.undo();
		form.compute(6);
		form.redo();
		form.compute(8);
		form.undo();
		form.redo();
		
		
	}

}
