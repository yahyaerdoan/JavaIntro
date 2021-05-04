package interfacesWork;

public class CustomerManager {

	// 1. kullan�m y�ntemi IcustomerDal� burada �a��r�yoruz. Ve onun i�ini
	// kullanabiliyoruz.
	// Bu kullan�m best de�il, best olan constructor i�inde �a��rmakt�r.

	// ICustomerDal customerDal;

	// 2. Kullan�m y�ntemi ise Constructor i�inden �a��rmak ve geli�tiricinin
	// unutmamas�n� sa�lamakt�r.
	
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	public void add() {

		customerDal.add();
	}

}
