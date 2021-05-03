package interfaces;

public class CustomerManager {

	// Dependency Enjection
	// Neye ba��ml� isek onun private de�i�kenini yap�yoruz.
	// Burada gev�ek ba��ml�l�k olu�turduk
	private Logger[] loggers;

	public CustomerManager(Logger[] logger) {
		super();
		this.loggers = logger;
	}

	public void add(Customer customer) {
		System.out.println("M��teri Eklendi " + customer.getFirstName());

		Utils.runLoggers(loggers, customer.getFirstName());

		// Birden fazla logger g�nderebilmek i�in diziye att�k (arrya) foreachle
		// d�nd�rd�k.
		// A�a��daki kodu her yerde tekrarlamamamk ve her yerden �a��rabilmek i�in utils
		// s�n�f�na ta��d�k.

		// for (Logger logger : loggers) {
		// logger.log(customer.getFirstName());

	}

	// Tek bir i�leme arac�l�k eder. Bu sebeble daha fazla ihtiyac�m�z� kar��lamakta
	// yetersiz kal�r.

	// Bu yap� Kat� ba��ml�l�k olu�turdu�u i�in ilerde de�i�ikli�e m�sade edemez
	// DataBaseLogger logger = new DataBaseLogger();
	// logger.log(customer.getFirstName() + " : Veri Taban�na Kaydedildi");

	public void delete(Customer customer) {
		System.out.println("M��teri Silindi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void update(Customer customer) {
		System.out.println("M��teri G�ncellendi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
