package task15;

public class Client {
   public static void main(String []args)
   {
	   Leader objDirector,objManager,objGeneralManager,objViceGeneralManager;
		
		objDirector=new Director("����");
		objManager=new BuManager("��ǿ");
		objGeneralManager=new GeneraManager("�");
		objViceGeneralManager=new FuManager("Ф��");
		
		objDirector.setSuccessor(objManager);
		objManager.setSuccessor(objViceGeneralManager);
		objViceGeneralManager.setSuccessor(objGeneralManager);
			
		BuyRequest lr1=new BuyRequest("����",1);
		objDirector.handleRequest(lr1);
		BuyRequest lr2=new BuyRequest("����",2);
		objDirector.handleRequest(lr2);
		BuyRequest lr5=new BuyRequest("����",6);
		objDirector.handleRequest(lr5);
		BuyRequest lr3=new BuyRequest("����",12);
		objDirector.handleRequest(lr3);
		BuyRequest lr4=new BuyRequest("����",21);
		objDirector.handleRequest(lr4);
   }
}
