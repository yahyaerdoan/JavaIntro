package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Mernis Sistem TC.Kimlik Do�rulama Yap�ld�!");
		System.out.println("MySql Veri Taban�na Kaydedildi! : " + customer.getFirstName() 
		+ " " + customer.getLastName());
		
	}

}
