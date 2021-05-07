package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Mernis Sistem TC.Kimlik Doðrulama Yapýldý!");
		System.out.println("MySql Veri Tabanýna Kaydedildi! : " + customer.getFirstName() 
		+ " " + customer.getLastName());
		
	}

}
