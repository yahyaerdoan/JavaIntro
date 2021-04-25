
public class switchYapisi {

	public static void main(String[] args) {
		// if bloklar� gibi �artl� dalland�rma y�ntemidir.
		// Herhangi bir de�ere g�re nas�l aksiyon verece�ini kontrol yap�m�zd�r.
		// �f bloklar�na g�re daha az kullan�lan y�ntemdir.
		// iyi kod yazma tekniklerini suistimal eden yap�d�r. do�ru yerde kullanmak
		// gerekir.
		// �ok durumlu dalland�rma yap�s�d�r.

		// Switch-case yap�s�, �ok durumlu dallanma ifadelerinde if-else bloklar� yerine
		// tercihen kullan�l�rlar. Switch-case ile yap�labilecek t�m i�lemler
		// if-else merdiveni ile de yap�labilmektedir.
		// Fakat kod okunabilirli�ini artt�rd��� i�in bir�ok programc�
		// switch-case yap�s�n� karma��k if-else bloklar� yerine kullanmaktad�r.

		//char tek karakter tutar 'A' �eklinde be daha anlam�l� not sistemi olsun diye 
		// string tuttum, string karekter toplulu�unu ifade eder.
		
		String grade = "AA";

		switch (grade) {

		case "AA": {
			System.out.println("AA : Ge�tiniz!");
			break;
		}
		case "BA": {
			System.out.println("BA : Ge�tiniz!");
			break;
		}
		case "BB": {
			System.out.println("BB : Ge�tiniz!");
			break;
		}
		case "CB": {
			System.out.println("CB : Ge�tiniz!");
			break;
		}
		case "CC": {
			System.out.println("CC : Ge�tiniz!");
			break;
		}
		case "DC": {
			System.out.println("DC : Ge�tiniz!");
			break;
		}
		case "DD": {
			System.out.println("DD : Ge�tiniz!");
			break;
		}
		case "FF": {
			System.out.println("FF : Kald�n�z!");
			break;
		}
		default:
			System.out.println("Ge�erli not giriniz!");
		}
	}

}
