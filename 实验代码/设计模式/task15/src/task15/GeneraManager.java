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
			System.out.println("�ܾ���" + name + "����Ա��" + request.getBuyName() + "�Ĳɹ������ɹ�Ǯ��Ϊ��" + request.getBuyMoney() + "��Ԫ��");
		}
		else
		{
			System.out.println("Ǯ��̫����Ҫ��ְ����������");
		}
	}
}
