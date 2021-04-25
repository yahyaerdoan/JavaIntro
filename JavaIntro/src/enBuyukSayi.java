
public class enBuyukSayi {

	public static void main(String[] args) {
		
		//Algoritmit mantýk kullanýlarak if þart bloklarýyla en büyük sayýyý bulduk.
		//Önce deðiþkenimizi tanýmladýk. Deðiþkenlerimizi blok içinde kullandýk.
		//Hangi sayý büyükse onu yazdýrdýk.
		
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
		System.out.println("En Büyük Sayý = " + enBuyuk);

	}

}
