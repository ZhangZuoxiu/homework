package bean;

public class House {

	private String hotel;
	private String state;
	private int price;
	private int discount;
	private int deposit;
	
	public String getHouseId() {
		return hotel;
	}
	public void setHouseId(String hotel) {
		this.hotel = hotel;
	}
	public String getHouseState() {
		return state;
	}
	public void setHouseState(String state) {
		this.state = state;
	}
	public int getHousePrice() {
		return price;
	}
	public void setHousePrice(int price) {
		this.price = price;
	}
	public int getHouseDiscount() {
		return discount;
	}
	public void setHouseDiscount(int discount) {
		this.discount = discount;
	}
	public int getHouseDeposit() {
		return deposit;
	}
	public void setHouseDeposit(int deposit) {
		this.deposit = deposit;
	}
}
