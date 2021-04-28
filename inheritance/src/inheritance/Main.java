package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer yahya = new IndividualCustomer();
		
		
		CorporateCustomer sirket = new CorporateCustomer();

		yahya.customerNumber = "12345";
		sirket.customerNumber = "67890";
		
		CustomerManager customerManager = new CustomerManager();
		
		//Tek tek eklme i�lemi
		customerManager.Add(sirket);
		customerManager.Add(yahya);
		
		System.out.println("--------------");
		
		//�oklu eklme i�lemi
		Customer[] customers = {yahya, sirket};
		customerManager.addMultiple(customers);
		
		
	}

}
