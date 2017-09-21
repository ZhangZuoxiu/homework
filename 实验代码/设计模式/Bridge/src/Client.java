
public class Client {
   public static void main(String []agrs){
	   Che che;
	   Rode rode;
	   
	   che=(Che)XMLUtilBridge.getBean("che");
	   rode=(Rode)XMLUtilBridge.getBean("rode");
	  
	   
	   che.setRode(rode);
	   che.CheType();
   }  
}
