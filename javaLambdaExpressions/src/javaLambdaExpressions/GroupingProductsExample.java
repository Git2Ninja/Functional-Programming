package javaLambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


	
	class Product1 {
		private String name;
		private String category;
		public Product1(String name, String category) {
			super();
			this.name = name;
			this.category = category;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
	
		
	}
	
	public class GroupingProductsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Product1> products = Arrays.asList(
					new Product1("Laptop","Electronics"),
					new Product1("Shirt","Clothing"),
					new Product1("Phone","Electronics"),
					new Product1("Jean","Clothing")
					);
			Map<String,List<Product1>>	productByCategory = products.stream()
					.collect(Collectors.groupingBy(Product1::getCategory));
			//Use foreach to read through the tream
			
			productByCategory.forEach((category, productList) -> {
				System.out.println("Category "+category);
				productList.forEach(product -> System.out.println(" -"+product.getName()));					
			});
	}
	
}