package task15;

public class Director extends Leader
{
	public Director(String name)
	{
		super(name);
	}
	public void handleRequest(BuyRequest request)
	{
		if(request.getBuyMoney()<=1)
		{
			System.out.println("����" + name + "����Ա��" + request.getBuyName() + "�Ĳɹ������ɹ�Ǯ��Ϊ��" + request.getBuyMoney() + "��Ԫ��");
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