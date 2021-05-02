package interfaces;

public class CustomerManager {

	private Logger[] loggers;
	
	public CustomerManager(Logger[] logger) {
		super();
		this.loggers = logger;
	}
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//for (Logger logger : loggers) {
		//	logger.log(customer.getFirstName());			
		}
		
		//DataBaseLogger logger = new DataBaseLogger();
		//logger.log(customer.getFirstName() + " : Veri Tabanýna Kaydedildi");
	
	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi " + customer.getFirstName());
	}
	public void update(Customer customer) {
		System.out.println("Müþteri Güncellendi " + customer.getFirstName());
	}	
	
}
