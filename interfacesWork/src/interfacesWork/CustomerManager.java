package interfacesWork;

public class CustomerManager {

	// 1. kullaným yöntemi IcustomerDalý burada çaðýrýyoruz. Ve onun içini
	// kullanabiliyoruz.
	// Bu kullaným best deðil, best olan constructor içinde çaðýrmaktýr.

	// ICustomerDal customerDal;

	// 2. Kullaným yöntemi ise Constructor içinden çaðýrmak ve geliþtiricinin
	// unutmamasýný saðlamaktýr.
	
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	public void add() {

		customerDal.add();
	}

}
