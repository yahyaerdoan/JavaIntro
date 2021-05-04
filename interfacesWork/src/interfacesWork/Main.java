package interfacesWork;

public class Main {

	public static void main(String[] args) {
		
		// Bu örnek sade ilk baþlangýç olarak yazdým kodu iyileþtirdik.
		ICustomerDal customerDal = new MySqlCustomerDal();
		customerDal.add();

		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

		// Constructor yapýsýný kullanmayý tercih ettiðim için onu dal içinden çaðýrmak
		// zorunda kalmadým. Artýk referansýný new CustomerManager içinde vereceðim
		
		// customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();

	}

}
