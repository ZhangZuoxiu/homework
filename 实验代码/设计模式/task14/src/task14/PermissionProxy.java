package task14;

public class PermissionProxy implements AbstractPermission{
      private RealPermission permission=new RealPermission();
      private int level=18;
      
      public void modifyUserInfo()
  	{
  		if(level<18)
  		{
  			System.out.println("�Բ��𣬲�������!");
  		}
  		else if(level>=18)
  		{
  			permission.modifyUserInfo();
  		}
  	}
  	
  	public void viewNote()
  	{
  		System.out.println("�鿴���ӣ�");
  	}
  	
  	public void publishNote()
  	{
  		if(level<18)
  		{
  			System.out.println("�Բ��𣬲�������!");
  		}
  		else if(level>=18)
  		{
  			permission.publishNote();
  		}		
  	}
  	
  	public void modifyNote()
  	{
  		if(level<18)
  		{
  			System.out.println("�Բ��𣬲�������!");
  		}
  		else if(level>=18)
  		{
  			permission.modifyNote();
  		}		
  	}
  	
  	public void setLevel(int level)
  	{
  		this.level=level;
  	}
}
