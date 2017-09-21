package task22;

public class RedState extends AccountState{
  
	public RedState(AccountState state)
	{
		this.balance=state.balance;
		this.acc=state.acc;
	}
	public void deposit(double amount)
	{
		this.balance+=balance;
	    stateCheck();
	}
	public void withdraw(double amount)
	{
		System.out.println("账户被冻结，取款失败。");
	}
	public void stateCheck()
	{
		if(balance>=0)
		{
			acc.setState(new GreenState(this));
		}
		else if(balance>=-1000)
		{
               acc.setState(new YellowState(this));
	    }
	}
	
}
