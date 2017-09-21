package task21;

public class Client {
	public static void main(String args[])
	{
		MySubject subject=new Gushi();
		
		MyObserver obs1=new Guming();
		subject.attach(obs1);
		subject.rise();
		subject.xiajiang();
	}

}
