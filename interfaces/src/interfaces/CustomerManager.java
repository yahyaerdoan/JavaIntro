package interfaces;

public class CustomerManager {

	// Dependency Enjection
	// Neye baðýmlý isek onun private deðiþkenini yapýyoruz.
	// Burada gevþek baðýmlýlýk oluþturduk
	private Logger[] loggers;

	public CustomerManager(Logger[] logger) {
		super();
		this.loggers = logger;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi " + customer.getFirstName());

		Utils.runLoggers(loggers, customer.getFirstName());

		// Birden fazla logger gönderebilmek için diziye attýk (arrya) foreachle
		// döndürdük.
		// Aþaðýdaki kodu her yerde tekrarlamamamk ve her yerden çaðýrabilmek için utils
		// sýnýfýna taþýdýk.

		// for (Logger logger : loggers) {
		// logger.log(customer.getFirstName());

	}

	// Tek bir iþleme aracýlýk eder. Bu sebeble daha fazla ihtiyacýmýzý karþýlamakta
	// yetersiz kalýr.

	// Bu yapý Katý baðýmlýlýk oluþturduðu için ilerde deðiþikliðe müsade edemez
	// DataBaseLogger logger = new DataBaseLogger();
	// logger.log(customer.getFirstName() + " : Veri Tabanýna Kaydedildi");

	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void update(Customer customer) {
		System.out.println("Müþteri Güncellendi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
