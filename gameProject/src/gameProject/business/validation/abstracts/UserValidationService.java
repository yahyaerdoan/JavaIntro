package gameProject.business.validation.abstracts;

import gameProject.entities.concretes.Customer;

public interface UserValidationService {

	boolean validate(Customer customer);
}
