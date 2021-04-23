public class Main {

	public static void main(String[] args) {
		//Dðiþkenler
		String internetSubeButonu = "Ýnternet Þubesi yahya Er";
		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		// intVade = 36;
		// boolean dustuMu = false;
		System.out.println(internetSubeButonu);

		//Þart Bloklarý
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar Düþtü Oku");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar Düþtü Oku");
		} else {
			System.out.println("Dolar Eþit Oku");
		}
		System.out.println("-----Manuel--------");

		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu Kredi";
		String kredi3 = "Çiftçi Kredi";
		String kredi4 = "Memur Kredi";
		String kredi5 = "Cahil Kredi";
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);

		System.out.println("------Dinamik-------");

		//Diziler
		String[] krediler = { "Hýzlý Kredi", "Mutlu Kredi", "Çiftçi Kredi", "Memur Kredi", "Cahil Kredi",
				"Yahya'ya Özel Kredi" };
		
		//Döngüler
		// foreachDongusu
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		System.out.println("------For döngüsü-------");
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		//DeðerTipler
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
		
		
		//String tipler Deðer tip gibi çalýþýr
		String sehir1 = "Ýstanbul";
		String sehir2 = "Uþak";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
		
		int saat= 22;
		if (saat < 10) {
		  System.out.println("Günaydýn.");
		} else if (saat < 20) {
		  System.out.println("Ýyi Günler.");
		} else {
		  System.out.println("Ýyi Akþamlar.");
		}
		
	}
}