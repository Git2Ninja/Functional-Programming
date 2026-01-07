package javaLambdaExpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Item {
	private String productName;
	private int price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Item(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [productName=" + productName + ", price=" + price + "]";
	}
	
	
}


public class StreamProductSortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> items = Arrays.asList(
				new Item("Ipad",190090),
				new Item("IPhone",190090),
				new Item("Macbook",12000)
				);
		List<Item> itemList = items.stream()
				.sorted(Comparator.comparing(Item::getPrice))
				.toList();
		
		itemList.forEach((i) -> System.out.println(i.toString()));
	}
}