package interfaces;

public class Utils {
	// Ara� s�n�f� olu�turduk. Bu metodu her yerden �a��rabilmek i�in temel bir ara�
	// s�n�f� olu�turduk
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}

}
