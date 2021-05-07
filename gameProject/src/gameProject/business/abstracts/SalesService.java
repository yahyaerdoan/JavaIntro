package gameProject.business.abstracts;

import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Customer;
import gameProject.entities.concretes.Game;

public interface SalesService {
	
	void sales(Customer customer, Game game);
    void campaignSales(Game game, Customer customer, Campaign campaign);
}