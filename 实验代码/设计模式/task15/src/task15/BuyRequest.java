package task15;

public class BuyRequest {
    private String buyName;
    private  int  buyMoney;
    
    public BuyRequest(String buyName,int buyMoney)
    {
    	this.buyName=buyName;
    	this.buyMoney=buyMoney;
    }
    public void setBuyName(String buyName)
    {
    	this.buyName=buyName;
    }
    public String getBuyName()
    {
    	return buyName;
    }
    
    public void setBuyMoney(int buyMoney)
    {
    	this.buyMoney=buyMoney;
    }
    public int getBuyMoney()
    {
    	return buyMoney;
    }
}
