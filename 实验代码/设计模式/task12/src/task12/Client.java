package task12;

public class Client {
   public static void main(String args[])
   {
	   Mainframe mf=new Mainframe();
	  try{
	   mf.on();
	  }
	  catch(Exception e)
	  {
		  System.out.println("����ʧ�ܡ�");
	  }
	   System.out.println("-------------------------------------");
        mf.off();
   }
}
