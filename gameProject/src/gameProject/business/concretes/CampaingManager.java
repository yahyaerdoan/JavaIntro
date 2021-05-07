package gameProject.business.concretes;

import gameProject.business.abstracts.CampaingService;
import gameProject.entities.concretes.Campaign;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + " " + "isimli kampanya eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + " " + "isimli kampanya güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaingName() + " " + "isimli kampanya silindi.");
		
	}

}
