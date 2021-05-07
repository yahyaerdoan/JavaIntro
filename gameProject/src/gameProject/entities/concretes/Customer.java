package gameProject.entities.concretes;

import java.time.LocalDate;

import gameProject.entities.abstracts.Entity;

public class Customer implements Entity{

	private int id;	
	private String firstName;	
	private String lastName;	
	private LocalDate dateOfBirth;	
	private Long identityNumber ;
	
	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, Long identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.identityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(Long identityNumber) {
		this.identityNumber = identityNumber;
	}	
	
}
