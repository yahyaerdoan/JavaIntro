
public class enBuyukSayi {

	public static void main(String[] args) {
		
		//Algoritmit mant�k kullan�larak if �art bloklar�yla en b�y�k say�y� bulduk.
		//�nce de�i�kenimizi tan�mlad�k. De�i�kenlerimizi blok i�inde kulland�k.
		//Hangi say� b�y�kse onu yazd�rd�k.
		
		int sayi1 = 300;
		int sayi2 = 400;
		int sayi3 = 500;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;

		}
		else if (enBuyuk < sayi3) {
			enBuyuk = sayi3;

		}
		System.out.println("En B�y�k Say� = " + enBuyuk);

	}

}
