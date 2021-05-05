package nLayeredArchitecture.dataAccess.concretes;

import java.util.List;

import nLayeredArchitecture.dataAccess.abstracts.ProductDao;
import nLayeredArchitecture.entities.concretes.Product;

public class AbcSistemProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("AbcSistem ile eklendi : " + product.getName());
		
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
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
