package oop1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delogi Kahve Makinası");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStocks(3);
		product1.setImageUrl("image1.jpg");
		
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinası");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStocks(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinası");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStocks(3);
		product3.setImageUrl("image3.jpg");
		
		
		Product[] products = {product1,product2,product3};
		
		System.out.println( );
		for(Product product : products ) {
			
			System.out.println(product.getName());
			
			IndividualCustomer individualCustomer = new IndividualCustomer();
			individualCustomer.setId(1);
			individualCustomer.setCustomerNumber("1234");
			individualCustomer.setPhone("05537899900");
			individualCustomer.setFistName("Emre");
			individualCustomer.setLastName("Şahin");
			
			CorporateCustomer corporateCustomer = new CorporateCustomer();
			
			corporateCustomer.setId(2);
			corporateCustomer.setCampanyName("Agt Kargo");
			corporateCustomer.setPhone("0533333333");
			corporateCustomer.setTaxNumber("54321");
			corporateCustomer.setCustomerNumber("54321");
			
			Customer[] customers = {individualCustomer,corporateCustomer };
		}
	}

}
