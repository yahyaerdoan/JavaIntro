package gameProject.business.concretes;

import gameProject.business.abstracts.SalesService;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Customer;
import gameProject.entities.concretes.Game;

public class SalesManager implements SalesService{

	@Override
	public void sales(Customer customer, Game game) {
		System.out.println((game.getGameName() + " isimli oyun " + customer.getFirstName() + " " + 
	customer.getLastName() 
                + " isimli kullan�c�ya " + game.getUnitPrice() + " TL " + " fiyatla sat�ld�."));		
	}

	@Override
	public void campaignSales(Game game, Customer customer, Campaign campaign) {
		
	    double discountedSales = game.getUnitPrice() - (game.getUnitPrice() * campaign.getDiscountRate());
	    System.out.println(game.getGameName() +" "+ "isimli oyun" +" "+ customer.getFirstName() + " " +
	    customer.getLastName() +" "+ "isimli m��teriye" + " " + campaign.getCampaingName() 
	    +" "+ "kampanyas� ile" +" "+ 
	    		discountedSales +" "+ "tl" +" "+  "fiyatla sat�ld�.");
	    		
	}
	
}