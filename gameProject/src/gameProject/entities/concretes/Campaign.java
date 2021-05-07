package gameProject.entities.concretes;

import gameProject.entities.abstracts.Entity;

public class Campaign implements Entity{
	private int id;	
	private String CampaingName;	
	private double DiscountRate;
	
	public Campaign() {
		super();
	}

	public Campaign(int id, String campaingName, double discountRate) {
		super();
		this.id = id;
		CampaingName = campaingName;
		DiscountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return CampaingName;
	}

	public void setCampaingName(String campaingName) {
		CampaingName = campaingName;
	}

	public double getDiscountRate() {
		return DiscountRate;
	}

	public void setDiscountRate(double discountRate) {
		DiscountRate = discountRate;
	}
}