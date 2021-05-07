package gameProject;

import java.time.LocalDate;

import gameProject.adapters.DefaultServiceManagerAdapter;
import gameProject.adapters.MernisServiceManagerAdapter;
import gameProject.business.concretes.CampaingManager;
import gameProject.business.concretes.CustomerManager;
import gameProject.business.concretes.GameManager;
import gameProject.business.concretes.SalesManager;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Customer;
import gameProject.entities.concretes.Game;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MernisServiceManagerAdapter());
		Customer customer = new Customer(2, "Yahya", "Erdoðan", LocalDate.of(1111, 01, 31), 12345678901L);
		customerManager.add(customer);
            
		GameManager gameManager =new GameManager();
		Game game = new Game(1, "gTA", "Aksiyon", 145);
		gameManager.add(game);
		
		CampaingManager campaingManager = new CampaingManager();
		Campaign campaign = new Campaign(1, "Cicikuþ'a Özel %25 indirm", 0.25);
		campaingManager.add(campaign);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sales(customer, game);
		salesManager.campaignSales(game, customer, campaign);
	}

}
