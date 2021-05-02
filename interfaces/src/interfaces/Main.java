package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new EmailLogger(), new SmsLogger(), new DataBaseLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer yahya = new Customer(1, "Yahya", "Erdoðan");
		customerManager.add(yahya);

	}

}
