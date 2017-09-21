package task19;

import java.util.ArrayList;
import java.util.Hashtable;

abstract class AbstractChatroom
{
	public abstract void register(Member member);
	public abstract void sendText(String from,String to,String message);
	public abstract void sendImage(String from,String to,String message);
	public abstract void sendEverone(String from,String Message);
}
 
 class ChatGroup extends AbstractChatroom
 {
 	private Hashtable members=new Hashtable();
 	
 	public void register(Member member)
 	{
 		if(!members.contains(member))
 		{
 			members.put(member.getName(),member);
 			member.setChatroom(this);
 		}
 	}
 	
    public void sendText(String from,String to,String message)
    {
    	  Member member=(Member)members.get(to);
    	 
    	  String newMessage=message;
    	  newMessage=message.replaceAll("��","*");
 	  member.receiveText(from,newMessage);
    }
    
    public void sendImage(String from,String to,String image)
    {
    	  Member member=(Member)members.get(to);
    	  //ģ��ͼƬ��С�ж�
    	  if(image.length()>5)
    	  {
    	  	  System.out.println("ͼƬ̫�󣬷���ʧ�ܣ�");
    	  }
    	  else
    	  {
    	  	  member.receiveImage(from,image);
    	  }
    }

	@Override
	public void sendEverone(String from,String message) {
		// TODO Auto-generated method stub
		
		 java.util.Iterator it=members.keySet().iterator();
	 		while(it.hasNext())
	 		{
	 			String key=(String)it.next();
	 			Member member=(Member)members.get(key);
	 			String newMessage=message;
	 			 newMessage=message.replaceAll("��","*");
		   	       member.receiveText(from,newMessage);
	 		}
	}
 }
 

 class CommonMember extends Member
{
	
	public CommonMember(String name)
	{
		super(name);
	}
	
	public void sendText(String to,String message)
	{
	    System.out.println("��ͨ��Ա��Ա������Ϣ��");
	    chatroom.sendText(name,to,message);  //����
	}
	
	public void sendImage(String to,String image)
	{
		System.out.println("��ͨ��Ա���ܷ���ͼƬ��");
	}

	@Override
	public void sendEveryone(String messsge) {
		// TODO Auto-generated method stub
		System.out.println("��ͨ��Ա����Ⱥ����");
	}
	
	
}
 
  class DiamondMember extends Member
 {
		
 	public DiamondMember(String name)
 	{
 		super(name);
 	}
 	
 	public void sendText(String to,String message)
 	{
 	    System.out.println("��ʯ��Ա������Ϣ��");
 	    chatroom.sendText(name,to,message);  //����
 	}
 	
 	public void sendImage(String to,String image)
 	{
 		System.out.println("��ʯ��Ա����ͼƬ��");
 	    chatroom.sendImage(name,to,image);  //����
 	}
 	public void sendEveryone(String message)
 	{     System.out.println("��ʯ��Ա����ȫ����Ϣ��");
 
 		chatroom.sendEverone(name,message);  //����;
    	
 	}

	
 }
  
  
   abstract class Member
  {
  	protected AbstractChatroom chatroom;
  	protected String name;
  	
  	public Member(String name)
  	{
  		this.name=name;
  	}
  	
  	public String getName()
  	{
  		return name;
  	}
  	
  	public void setName(String name)
  	{
  		this.name=name;
  	}
  	
  	public AbstractChatroom getChatroom()
  	{
  		return chatroom;
  	}
  	
      public void setChatroom(AbstractChatroom chatroom)
      {
      	this.chatroom=chatroom;
      }
  	
  	public abstract void sendText(String to,String message);
  	public abstract void sendImage(String to,String image);
  	public abstract void sendEveryone(String messsge);

      public void receiveText(String from,String message)
      {
      	System.out.println(from + "�����ı���" + this.name + "������Ϊ��" + message);
      }
      
      public void receiveImage(String from,String image)
      {
      	System.out.println(from + "����ͼƬ��" + this.name + "������Ϊ��" + image);
      }	
  }


   public class Client
   {
   	public static void main(String args[])
   	{
   		AbstractChatroom happyChat=new ChatGroup();
   		Member member1,member2,member3,member4,member5;
   		member1=new DiamondMember("����");
   		member2=new DiamondMember("����");
   		member3=new CommonMember("����");
   		member4=new CommonMember("С��");
   		member5=new CommonMember("С��");
   		
   		happyChat.register(member1);
   		happyChat.register(member2);
   		happyChat.register(member3);
   		happyChat.register(member4);
   		happyChat.register(member5);
   		
   		member1.sendText("����","���ģ���ã�");
   		member2.sendText("����","��������ã�");
   		member1.sendText("����","���������������գ�");
   		member2.sendImage("����","һ���ܴ�ܴ��̫��");
   		member2.sendImage("����","̫��");
   		member3.sendText("С��","����������");
   		member3.sendText("С��","����������");
   		member4.sendText("����","û���ˣ�лл��");
   		member5.sendText("����","��Ҳû���ˣ�");
   		member5.sendImage("����","лл");
   		System.out.println("\t");
   		
   		member1.sendEveryone("����");
   		member3.sendEveryone("�Ǻ�");
   	}
   }
