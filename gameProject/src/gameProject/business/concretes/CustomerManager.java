package gameProject.business.concretes;

import gameProject.business.abstracts.CustomerService;
import gameProject.business.validation.abstracts.UserValidationService;
import gameProject.entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	UserValidationService userValidationService;
	

	public CustomerManager(UserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Customer customer) {
		if (userValidationService.validate(customer)==true) {
			System.out.println(customer.getFirstName()  + " " + customer.getLastName() + "\n" + "Tebrikler; Kaydınız Başarıyla Gerçekleşmiştir!");

		} else {

			System.out.println("Doğrulama Başarısız, Kayıt Başarısız!");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()  + " " + customer.getLastName() + "\n" + "Kaydınız Başarıyla Silinmiştir!");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()  + " " + customer.getLastName() + "\n" + "Kaydınız Başarıyla Güncellenmiştir!");

		
	}
	
}