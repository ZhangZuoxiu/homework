package task13_1;

public class Client {
	public static void main(String []args)
	{
 Qizi black1,black2,black3,white1,white2,white3;
 QiziFactory factory;
 factory=QiziFactory.getInstance();
 black1=factory.getQizi("b");
 black2=factory.getQizi("b");
 black3=factory.getQizi("b");
 white1=factory.getQizi("w");
 white2=factory.getQizi("w");
 white3=factory.getQizi("w");
 black1.location(new Location(1,1));
 black2.location(new Location(1,2));
 black3.location(new Location(1,3));
 white1.location(new Location(2,1));
 white2.location(new Location(2,2));
 white3.location(new Location(2,3));
 
	}
}