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
        System.out.println("请输入访问者:");
        Scanner read=new Scanner(System.in);
        String panduan=read.nextLine();
        System.out.println(panduan);
       if(panduan.equals("打包员"))    	   
       {
    	  
    	   visitor=new Dabao();
    	   visitor.setName("张三");
       	
           basket.accept(visitor);
       }
       else if(panduan.equals("售货员"))
       {
    	   visitor=new Saler();
    	   visitor.setName("张三");
          	
           basket.accept(visitor);
       }
       else
       {
    	   System.out.println("输入不正确!");
       }
	}
}