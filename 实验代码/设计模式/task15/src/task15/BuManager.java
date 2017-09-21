package task15;

public class BuManager extends Director {
	public BuManager(String name)
	{
		super(name);
	}
	public void handleRequest(BuyRequest request)
	{
		if(request.getBuyMoney()<5)
		{
			System.out.println("部门经理" + name + "审批员工" + request.getBuyName() + "的采购单，采购钱数为：" + request.getBuyMoney() + "万元。");
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
