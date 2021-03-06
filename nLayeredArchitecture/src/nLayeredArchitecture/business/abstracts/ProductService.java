package nLayeredArchitecture.business.abstracts;

import java.util.List;

import nLayeredArchitecture.entities.concretes.Product;

public interface ProductService {

	void add(Product product);
	void delete(Product product);
	void update(Product product);
	List<Product> getAll();
}
