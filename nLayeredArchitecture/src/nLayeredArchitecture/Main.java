package nLayeredArchitecture;

import nLayeredArchitecture.business.abstracts.ProductService;
import nLayeredArchitecture.business.concretes.ProductManager;
import nLayeredArchitecture.core.JLoggerManagerAdapter;
import nLayeredArchitecture.dataAccess.concretes.HibernateProductDao;
import nLayeredArchitecture.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new HibernateProductDao(), 
				new JLoggerManagerAdapter());
		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.add(product);

	}

}
