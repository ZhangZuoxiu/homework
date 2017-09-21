package task21;

public class Gushi extends MySubject{
	public void rise()
	{
		System.out.println("股市上升5%");
		System.out.println("----------------------------");		
		
		for(Object obs:observers)
		{
			((MyObserver)obs).response1();
		}
		
	}	
	public void xiajiang()
	{
		System.out.println("股市下降5%");
		System.out.println("----------------------------");		
		
		for(Object obs:observers)
		{
			((MyObserver)obs).response2();
		}
		
	}	
	
}
