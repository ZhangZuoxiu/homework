package task25;

import java.util.Scanner;

public class Client
{
	@SuppressWarnings("null")
	public static void main(String a[])
	{
		Product b1=new Book();
		Product b2=new Book();
		Product a1=new Apple();
		Visitor visitor = null;
		
        BuyBasket basket=new BuyBasket();
        basket.addProduct(b1);
        basket.addProduct(b2);
        basket.addProduct(a1);
        System.out.println("�����������:");
        Scanner read=new Scanner(System.in);
        String panduan=read.nextLine();
        System.out.println(panduan);
       if(panduan.equals("���Ա"))    	   
       {
    	  
    	   visitor=new Dabao();
    	   visitor.setName("����");
       	
           basket.accept(visitor);
       }
       else if(panduan.equals("�ۻ�Ա"))
       {
    	   visitor=new Saler();
    	   visitor.setName("����");
          	
           basket.accept(visitor);
       }
       else
       {
    	   System.out.println("���벻��ȷ!");
       }
	}
}