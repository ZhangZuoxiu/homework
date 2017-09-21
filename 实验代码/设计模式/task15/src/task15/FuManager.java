package task15;

public class FuManager extends Leader {
	public FuManager(String name)
	{
		super(name);
	}
	public void handleRequest(BuyRequest request)
	{
		if(request.getBuyMoney()<=10)
		{
			System.out.println("副总经理" + name + "审批员工" + request.getBuyName() + "的采购单，采购钱数为：" + request.getBuyMoney() + "万元。");
		}
		else
		{
			if(this.successor!=null)
			{
				this.successor.handleRequest(request);
			}
		}
	}
}
