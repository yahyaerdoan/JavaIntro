public class Main {

	public static void main(String[] args) {
		//D�i�kenler
		String internetSubeButonu = "�nternet �ubesi yahya Er";
		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		// intVade = 36;
		// boolean dustuMu = false;
		System.out.println(internetSubeButonu);

		//�art Bloklar�
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar D��t� Oku");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar D��t� Oku");
		} else {
			System.out.println("Dolar E�it Oku");
		}
		System.out.println("-----Manuel--------");

		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu Kredi";
		String kredi3 = "�ift�i Kredi";
		String kredi4 = "Memur Kredi";
		String kredi5 = "Cahil Kredi";
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);

		System.out.println("------Dinamik-------");

		//Diziler
		String[] krediler = { "H�zl� Kredi", "Mutlu Kredi", "�ift�i Kredi", "Memur Kredi", "Cahil Kredi",
				"Yahya'ya �zel Kredi" };
		
		//D�ng�ler
		// foreachDongusu
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		System.out.println("------For d�ng�s�-------");
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		//De�erTipler
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		//ReferansTipler
		int[] sayilar1 = {1, 2, 3, 4, 5};
		int[] sayilar2 = {10, 20, 30, 40, 50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		
		//String tipler De�er tip gibi �al���r
		String sehir1 = "�stanbul";
		String sehir2 = "U�ak";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		
		int saat= 22;
		if (saat < 10) {
		  System.out.println("G�nayd�n.");
		} else if (saat < 20) {
		  System.out.println("�yi G�nler.");
		} else {
		  System.out.println("�yi Ak�amlar.");
		}
		
	}
}