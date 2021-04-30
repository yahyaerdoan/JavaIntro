package polimorphism;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DataBaseLogger(), 
				new EmailLogger(), new BookLogger()};
		for (BaseLogger logger : loggers) {
			logger.log("Sisteme Loglandý");
		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
		System.out.println();
		
		//EmailLogger logger = new EmailLogger();
		//logger.log("loglandý");

	}

}

