package gameProject.business.abstracts;

import gameProject.entities.concretes.Customer;

public interface CustomerService {
	
	 void add(Customer customer);
     void delete(Customer customer);
     void update(Customer customer);
}