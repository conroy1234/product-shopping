package product.model;

public class Product {

	private String name;
	private int price;
	private int quantity;
	private final int totalPrice;

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = (this.price * this.quantity);
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	@Override
	public String toString() {
		return "product :" + name + ", unit price : £" + price + ", purchase amount :" + quantity + ", totalPrice = £"
				+ totalPrice;
	}

}
