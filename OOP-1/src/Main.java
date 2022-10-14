
public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";
		// SET VALUE
		// bu bölümde değer atandı
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7500);
		product1.setUnitPrice(3);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(6500);
		product2.setUnitPrice(4);
		product2.setUnitInStock(3);
		product2.setImageUrl("image2.jpg");


		Product product3 = new Product();
		product3.setName("Kitchen Aid  Kahve Makinesi");
		product3.setDiscount(8500);
		product3.setUnitPrice(2);
		product3.setUnitInStock(5);
		product3.setImageUrl("image3.jpg");


		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {

			System.out.println("<li> " + product.getName() + "</li>");

		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("526331");
		individualCustomer.setPhone("123456" );
		individualCustomer.setFirstName("Engin ");
		individualCustomer.setLastName("Demiroğ");

		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("05236252312");
		corporateCustomer.setCustomerNumber("56");
		corporateCustomer.setCompanyName("yugam");
		corporateCustomer.setTaxNumber("5");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
	}

}
