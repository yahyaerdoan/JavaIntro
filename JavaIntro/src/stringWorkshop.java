
public class stringWorkshop {

	public static void main(String[] args) {
		// Metinsel veriler

		String mesaj = "Bug�n hava kapal�";
		System.out.println(mesaj);

		System.out.println("Eleman Say�s� : " + mesaj.length()); // index eleman say�lar� toplam�n� verir.
		System.out.println("5. Eleman Say�s� : " + mesaj.charAt(4)); // index eleman say�s�n� verir.
		System.out.println(mesaj.concat(" ve ya�murlu. ")); // C�mleye ekleme yapar.
		System.out.println(mesaj.startsWith("B")); // Boolean d�nd�r�r. C�mle verdi�im harf ile mi ba�l�yor sorusuna //
													// yan�t verir.
		System.out.println(mesaj.endsWith("�")); // Verdi�im harf ile mi bitiyor sorusuna cevap verir.

		char[] karakterler = new char[5]; // istenilen index eleman�n� getirir.
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("va")); // verilen karekteri arama yapar
		System.out.println(mesaj.lastIndexOf("p")); // verilen karekteri en sondan aramaya ba�lar.

		System.out.println(mesaj.replace('B', 'b')); // bu �elilde de kullan�l�r.

		String yeniMesaj = mesaj.replace('B', 'b'); // yeni mesaj tan�mlamak daha do�ru olur.
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2)); // verilen indexten sonras�n� al�r.
		System.out.println(mesaj.substring(2, 5)); // verilen indexten aras�n� al�r.
		
		for (String kelime : mesaj.split(" ")) { //dizi elemanlar�n� ayr� ayr� getirir.
			System.out.println(kelime);			
		}
		
		System.out.println(mesaj.toLowerCase()); //b�t�n harfleri k���k yazd�r�r.
		System.out.println(mesaj.toUpperCase()); //b�t�n harfleri B�Y�K yazd�r�r.
		System.out.println(mesaj.trim()); // veri uyu�mazl���n�n �n�ne ge�er C�mle ba��ndaki sonundaki bo�luklar� al�r.
		
	}

}
