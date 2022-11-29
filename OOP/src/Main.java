
public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";
		// set value
		Product product1 = new Product();

		product1.setName("Nescafe Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jp");
		product1.setDiscount(7);

		Product product2 = new Product();
		product2.setName("jasobs Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image2.jp");
		product2.setDiscount(7);

		Product product3 = new Product();
		product3.setName("Ülker Kahve Makinesi");
		product3.setUnitPrice(8500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image3.jp");
		product3.setDiscount(7);

		Product[] products = { product1, product2, product3 };
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0522222");
		individualCustomer.setCustomerNumber("123456");
		individualCustomer.setFirstname("Furkan");
		individualCustomer.setLastname("Akın");

		CorporateCustomer corporaterCustomer = new CorporateCustomer();
		corporaterCustomer.setId(2);
		corporaterCustomer.setCompanyName("MajorGroup");
		corporaterCustomer.setTaxNumber("123456");
		corporaterCustomer.setPhone("0533333");
		corporaterCustomer.setCustomerNumber("4566668");
		
		Customer[] customers = {individualCustomer,corporaterCustomer};
		
	}

}
