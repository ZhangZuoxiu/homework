package task11;

public class PhoneDecorator implements Phone{
	private Phone phone;
	public PhoneDecorator(Phone phone){
		
		if(phone!=null)
			{
			this.phone=phone;
			}
		else{
			this.phone=new SimplePhone();
		}
	}
	  public void display(){
		  phone.display();
	  }
	 
}
