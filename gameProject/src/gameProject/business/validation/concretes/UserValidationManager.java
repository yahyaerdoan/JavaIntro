package gameProject.business.validation.concretes;

import gameProject.adapters.DefaultServiceManagerAdapter;
import gameProject.business.validation.abstracts.UserValidationService;
import gameProject.entities.concretes.Customer;

public class UserValidationManager implements UserValidationService{

	UserValidationService userValidationService;
	@Override
	public boolean validate(Customer customer) {
		userValidationService = new DefaultServiceManagerAdapter();
		return userValidationService.validate(customer);
	}

}
