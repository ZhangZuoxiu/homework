package task15;

public class Client {
   public static void main(String []args)
   {
	   Leader objDirector,objManager,objGeneralManager,objViceGeneralManager;
		
		objDirector=new Director("王明");
		objManager=new BuManager("赵强");
		objGeneralManager=new GeneraManager("李波");
		objViceGeneralManager=new FuManager("肖红");
		
		objDirector.setSuccessor(objManager);
		objManager.setSuccessor(objViceGeneralManager);
		objViceGeneralManager.setSuccessor(objGeneralManager);
			
		BuyRequest lr1=new BuyRequest("张三",1);
		objDirector.handleRequest(lr1);
		BuyRequest lr2=new BuyRequest("张三",2);
		objDirector.handleRequest(lr2);
		BuyRequest lr5=new BuyRequest("张三",6);
		objDirector.handleRequest(lr5);
		BuyRequest lr3=new BuyRequest("张三",12);
		objDirector.handleRequest(lr3);
		BuyRequest lr4=new BuyRequest("张三",21);
		objDirector.handleRequest(lr4);
   }
}
