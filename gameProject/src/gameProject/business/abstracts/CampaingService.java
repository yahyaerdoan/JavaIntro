package gameProject.business.abstracts;

import gameProject.entities.concretes.Campaign;

public interface CampaingService {
	
	 void add(Campaign campaign);
     void update(Campaign campaign);
     void delete(Campaign campaign);
}