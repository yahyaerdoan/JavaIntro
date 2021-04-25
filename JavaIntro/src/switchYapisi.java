
public class switchYapisi {

	public static void main(String[] args) {
		// if bloklarý gibi þartlý dallandýrma yöntemidir.
		// Herhangi bir deðere göre nasýl aksiyon vereceðini kontrol yapýmýzdýr.
		// Ýf bloklarýna göre daha az kullanýlan yöntemdir.
		// iyi kod yazma tekniklerini suistimal eden yapýdýr. doðru yerde kullanmak
		// gerekir.
		// çok durumlu dallandýrma yapýsýdýr.

		// Switch-case yapýsý, çok durumlu dallanma ifadelerinde if-else bloklarý yerine
		// tercihen kullanýlýrlar. Switch-case ile yapýlabilecek tüm iþlemler
		// if-else merdiveni ile de yapýlabilmektedir.
		// Fakat kod okunabilirliðini arttýrdýðý için birçok programcý
		// switch-case yapýsýný karmaþýk if-else bloklarý yerine kullanmaktadýr.

		//char tek karakter tutar 'A' þeklinde be daha anlamýlý not sistemi olsun diye 
		// string tuttum, string karekter topluluðunu ifade eder.
		
		String grade = "AA";

		switch (grade) {

		case "AA": {
			System.out.println("AA : Geçtiniz!");
			break;
		}
		case "BA": {
			System.out.println("BA : Geçtiniz!");
			break;
		}
		case "BB": {
			System.out.println("BB : Geçtiniz!");
			break;
		}
		case "CB": {
			System.out.println("CB : Geçtiniz!");
			break;
		}
		case "CC": {
			System.out.println("CC : Geçtiniz!");
			break;
		}
		case "DC": {
			System.out.println("DC : Geçtiniz!");
			break;
		}
		case "DD": {
			System.out.println("DD : Geçtiniz!");
			break;
		}
		case "FF": {
			System.out.println("FF : Kaldýnýz!");
			break;
		}
		default:
			System.out.println("Geçerli not giriniz!");
		}
	}

}
