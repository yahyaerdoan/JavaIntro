package inheritance;

public class CustomerManager {

	public void Add(Customer customer) {
		System.out.println(customer.customerNumber +" : " + "Kaydedildi");
		
	}
	//bulk insert : çoklu iþlem yapabilme 
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			Add(customer);
		}
		
	}
}
