
public class paremetreliMethods {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava g�zel!";
		
		String yeniMesaj = mesaj.substring(0);
		System.out.println(yeniMesaj);
		
		String yeniMesajSehir = sehirVer("Ankara");
		System.out.println(yeniMesajSehir);
		
		int sayi = topla(6667567, 1);
		System.out.println(sayi);
	}

	// Void herhangi bir de�er d�nd�rmez	
	public static void ekle() {
		System.out.println("Eklendi");
		
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void g�ncelle() {
		System.out.println("G�ncellendi");
	}
	public static String sehirVer(String sehir) {		
		return "Ankara";
	}
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
		
	}
}
