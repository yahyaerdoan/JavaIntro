package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomenGameCalculator calculator = new WomenGameCalculator();
		calculator.hesapla();
		calculator.gameOver();
		ManGameCalculator calculator2 = new ManGameCalculator();
		calculator2.hesapla();

		//Base s�n�ftan newleyerek i�lem yapabiliriz.
		GameCalculator gameCalculator = new OlderGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
			
			
	}

}
