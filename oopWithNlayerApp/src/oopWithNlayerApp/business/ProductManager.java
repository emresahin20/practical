package oopWithNlayerApp.business;

import oopWithNlayerApp.core.logging.Logger;

import oopWithNlayerApp.dataAccess.ProductDao;
import oopWithNlayerApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[]loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}

	public void add(Product product) throws Exception {
		
		
		if(product.getUnitPrice()<10) {
			throw new Exception ("ürün fiyatı 10 dan küçük olamaz");
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	
	}
}
