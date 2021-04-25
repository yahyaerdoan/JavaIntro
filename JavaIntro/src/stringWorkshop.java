
public class stringWorkshop {

	public static void main(String[] args) {
		// Metinsel veriler

		String mesaj = "Bugün hava kapalý";
		System.out.println(mesaj);

		System.out.println("Eleman Sayýsý : " + mesaj.length()); // index eleman sayýlarý toplamýný verir.
		System.out.println("5. Eleman Sayýsý : " + mesaj.charAt(4)); // index eleman sayýsýný verir.
		System.out.println(mesaj.concat(" ve yaðmurlu. ")); // Cümleye ekleme yapar.
		System.out.println(mesaj.startsWith("B")); // Boolean döndürür. Cümle verdiðim harf ile mi baþlýyor sorusuna //
													// yanýt verir.
		System.out.println(mesaj.endsWith("ý")); // Verdiðim harf ile mi bitiyor sorusuna cevap verir.

		char[] karakterler = new char[5]; // istenilen index elemanýný getirir.
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("va")); // verilen karekteri arama yapar
		System.out.println(mesaj.lastIndexOf("p")); // verilen karekteri en sondan aramaya baþlar.

		System.out.println(mesaj.replace('B', 'b')); // bu þelilde de kullanýlýr.

		String yeniMesaj = mesaj.replace('B', 'b'); // yeni mesaj tanýmlamak daha doðru olur.
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2)); // verilen indexten sonrasýný alýr.
		System.out.println(mesaj.substring(2, 5)); // verilen indexten arasýný alýr.
		
		for (String kelime : mesaj.split(" ")) { //dizi elemanlarýný ayrý ayrý getirir.
			System.out.println(kelime);			
		}
		
		System.out.println(mesaj.toLowerCase()); //bütün harfleri küçük yazdýrýr.
		System.out.println(mesaj.toUpperCase()); //bütün harfleri BÜYÜK yazdýrýr.
		System.out.println(mesaj.trim()); // veri uyuþmazlýðýnýn önüne geçer Cümle baþýndaki sonundaki boþluklarý alýr.
		
	}

}
