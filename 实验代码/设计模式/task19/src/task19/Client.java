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
    	  newMessage=message.replaceAll("日","*");
 	  member.receiveText(from,newMessage);
    }
    
    public void sendImage(String from,String to,String image)
    {
    	  Member member=(Member)members.get(to);
    	  //模拟图片大小判断
    	  if(image.length()>5)
    	  {
    	  	  System.out.println("图片太大，发送失败！");
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
	 			 newMessage=message.replaceAll("日","*");
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
	    System.out.println("普通会员会员发送信息：");
	    chatroom.sendText(name,to,message);  //发送
	}
	
	public void sendImage(String to,String image)
	{
		System.out.println("普通会员不能发送图片！");
	}

	@Override
	public void sendEveryone(String messsge) {
		// TODO Auto-generated method stub
		System.out.println("普通会员不能群发！");
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
 	    System.out.println("钻石会员发送信息：");
 	    chatroom.sendText(name,to,message);  //发送
 	}
 	
 	public void sendImage(String to,String image)
 	{
 		System.out.println("钻石会员发送图片：");
 	    chatroom.sendImage(name,to,image);  //发送
 	}
 	public void sendEveryone(String message)
 	{     System.out.println("钻石会员发送全体信息：");
 
 		chatroom.sendEverone(name,message);  //发送;
    	
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
      	System.out.println(from + "发送文本给" + this.name + "，内容为：" + message);
      }
      
      public void receiveImage(String from,String image)
      {
      	System.out.println(from + "发送图片给" + this.name + "，内容为：" + image);
      }	
  }


   public class Client
   {
   	public static void main(String args[])
   	{
   		AbstractChatroom happyChat=new ChatGroup();
   		Member member1,member2,member3,member4,member5;
   		member1=new DiamondMember("张三");
   		member2=new DiamondMember("李四");
   		member3=new CommonMember("王五");
   		member4=new CommonMember("小芳");
   		member5=new CommonMember("小红");
   		
   		happyChat.register(member1);
   		happyChat.register(member2);
   		happyChat.register(member3);
   		happyChat.register(member4);
   		happyChat.register(member5);
   		
   		member1.sendText("李四","李四，你好！");
   		member2.sendText("张三","张三，你好！");
   		member1.sendText("李四","今天天气不错，有日！");
   		member2.sendImage("张三","一个很大很大的太阳");
   		member2.sendImage("张三","太阳");
   		member3.sendText("小芳","还有问题吗？");
   		member3.sendText("小红","还有问题吗？");
   		member4.sendText("王五","没有了，谢谢！");
   		member5.sendText("王五","我也没有了！");
   		member5.sendImage("王五","谢谢");
   		System.out.println("\t");
   		
   		member1.sendEveryone("哈哈");
   		member3.sendEveryone("呵呵");
   	}
   }
