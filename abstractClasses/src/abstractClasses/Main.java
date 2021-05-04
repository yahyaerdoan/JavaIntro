package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomenGameCalculator calculator = new WomenGameCalculator();
		calculator.hesapla();
		calculator.gameOver();

		//Base sýnýftan newleyerek iþlem yapabiliriz.
		GameCalculator gameCalculator = new OlderGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
			
			
	}

}
