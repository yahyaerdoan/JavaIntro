package gameProject.adapters;

import gameProject.business.validation.abstracts.UserValidationService;
import gameProject.entities.concretes.Customer;

public class DefaultServiceManagerAdapter implements UserValidationService{
	
	public boolean validate(Customer customer) 
	{
		return true;
		
	}
}