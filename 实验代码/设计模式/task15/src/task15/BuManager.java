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
			System.out.println("���ž���" + name + "����Ա��" + request.getBuyName() + "�Ĳɹ������ɹ�Ǯ��Ϊ��" + request.getBuyMoney() + "��Ԫ��");
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
