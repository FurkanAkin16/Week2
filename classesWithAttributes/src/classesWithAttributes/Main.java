package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setPrice(5000);
		product.setDescription("Asus Laptop");
		product.setStockAmount(4);
		product.setId(0);
		ProductManager productmanager = new ProductManager();
		productmanager.Add(product);
		System.out.println(product.getDescription());
	}

}
