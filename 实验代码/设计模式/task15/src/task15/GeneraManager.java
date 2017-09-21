package task15;

public class GeneraManager extends Leader{
	public GeneraManager(String name)
	{
		super(name);
	}
	public void handleRequest(BuyRequest request)
	{
		if(request.getBuyMoney()<=20)
		{
			System.out.println("总经理" + name + "审批员工" + request.getBuyName() + "的采购单，采购钱数为：" + request.getBuyMoney() + "万元。");
		}
		else
		{
			System.out.println("钱数太大，需要开职工大会决定。");
		}
	}
}
