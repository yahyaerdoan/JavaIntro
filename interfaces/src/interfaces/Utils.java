package interfaces;

public class Utils {
	// Araç sýnýfý oluþturduk. Bu metodu her yerden çaðýrabilmek için temel bir araç
	// sýnýfý oluþturduk
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}

}
