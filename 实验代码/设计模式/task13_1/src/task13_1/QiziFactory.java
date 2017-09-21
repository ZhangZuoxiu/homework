package task13_1;

import java.util.Hashtable;

public class QiziFactory {
     private static QiziFactory instance=new QiziFactory();
     private static Hashtable ht;
     private QiziFactory()
     {
    	 ht=new Hashtable();
    	 Qizi black,white;
    	 black=new BlackQizi();
    	 ht.put("b", black);
    	 white=new WhiteQizi();
    	 ht.put("w", white);
     }
     public static QiziFactory getInstance()
     {
    	 return instance;
     }
     public  Qizi getQizi(String color)
     {
    	 return (Qizi)ht.get(color);
     }
}
