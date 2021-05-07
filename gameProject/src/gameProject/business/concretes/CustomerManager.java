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
			System.out.println(customer.getFirstName()  + " " + customer.getLastName() + "\n" + "Tebrikler; Kayd�n�z Ba�ar�yla Ger�ekle�mi�tir!");

		} else {

			System.out.println("Do�rulama Ba�ar�s�z, Kay�t Ba�ar�s�z!");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()  + " " + customer.getLastName() + "\n" + "Kayd�n�z Ba�ar�yla Silinmi�tir!");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()  + " " + customer.getLastName() + "\n" + "Kayd�n�z Ba�ar�yla G�ncellenmi�tir!");

		
	}
	
}