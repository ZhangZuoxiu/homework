package task23;

interface TravelStrategy
{
	
	public void travel();

}

class AirplaneStrategy implements  TravelStrategy
{	
	public void travel()
	{
		System.out.println("�ɻ��Σ�");
	}
}

class TrainStrategy implements  TravelStrategy
{
	public void travel()
	{
		System.out.println("���Σ�");
	}
}


class BicycleStrategy implements  TravelStrategy
{
	public void travel()
	{
		System.out.println("���г��Σ�");
	}
}

class Person
{
	private TravelStrategy ts;
	public Person(TravelStrategy ts)
	{
		this.ts=ts;
	}
	public void travel()
	{
		ts.travel();
	}
}

class Client
{
	public static void main(String args[])
	{
		Person mc=new Person(new BicycleStrategy());
		mc.travel();
		Person mc1=new Person(new TrainStrategy());
		mc1.travel();
		Person mc2=new Person(new  AirplaneStrategy());
		mc2.travel();
	}
}
