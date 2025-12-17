package javaLambdaExpressions;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Product {
	private String productName;
	private int price;
	public String getProductName() {
		return productName;
	
}

public Product(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}

public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + "]";
	}

}



public class SortProductExample {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = Arrays.asList(
				new Product("Cheese",30),new Product("Milk",48),new Product("Honey",23));
		//Lambda Expression Logic 1
		List <Product> result = products.stream()
		.sorted((a1,a2) -> a1.getPrice() - a2.getPrice())
		.toList();
		
		List <Product> result3 = products.stream()
		.sorted(Comparator.comparing(Product::getProductName).reversed())
		.toList();
		
		List <Product> result4 = products.stream()
		.sorted(Comparator.comparing(Product::getProductName))
		.toList();
		
		System.out.println(result.toString());			
		
		System.out.println(result4.toString());
		
		System.out.println(result3.toString());
	}

}
