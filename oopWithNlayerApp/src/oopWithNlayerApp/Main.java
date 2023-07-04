package oopWithNlayerApp;

import oopWithNlayerApp.business.ProductManager;
import oopWithNlayerApp.core.logging.DatabaseLogger;
import oopWithNlayerApp.core.logging.FileLogger;
import oopWithNlayerApp.core.logging.Logger;
import oopWithNlayerApp.dataAccess.JdbcProductDao;
import oopWithNlayerApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1,"Iphone Xr",10);
	
		Logger[]loggers= {new DatabaseLogger(),new FileLogger()};
		
		ProductManager productManager = 
				new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
	}

}
