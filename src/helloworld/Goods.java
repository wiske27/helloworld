package helloworld;

public class Goods {
	private String name;
	private int price;
	
	public Goods() {
		
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//overload
	public int calcDiscountPrice(double rate) {
		return (int)(price * rate) ; 
	}
	public int calcDiscountPrice(int rate) {
		return (price * rate) ; 
	}
	
}
