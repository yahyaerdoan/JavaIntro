package interfacesWork;

public class Main {

	public static void main(String[] args) {
		
		// Bu �rnek sade ilk ba�lang�� olarak yazd�m kodu iyile�tirdik.
		ICustomerDal customerDal = new MySqlCustomerDal();
		customerDal.add();

		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());

		// Constructor yap�s�n� kullanmay� tercih etti�im i�in onu dal i�inden �a��rmak
		// zorunda kalmad�m. Art�k referans�n� new CustomerManager i�inde verece�im
		
		// customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();

	}

}
