package nLayeredArchitecture.business.concretes;

import java.util.List;

import nLayeredArchitecture.business.abstracts.ProductService;
import nLayeredArchitecture.core.LoggerService;
import nLayeredArchitecture.dataAccess.abstracts.ProductDao;
import nLayeredArchitecture.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategori ürün eklemek için hazýr deðil!");
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün Eklendi : " + product.getName());

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
