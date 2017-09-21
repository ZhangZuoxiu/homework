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
			System.out.println("���ܾ���" + name + "����Ա��" + request.getBuyName() + "�Ĳɹ������ɹ�Ǯ��Ϊ��" + request.getBuyMoney() + "��Ԫ��");
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
