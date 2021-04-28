
public class variableArguments {

	public static void main(String[] args) {
		String mesaj = "Bugün hava güzel!";
		
		String yeniMesaj = mesaj.substring(0);
		System.out.println(yeniMesaj);
		
		String yeniMesajSehir = sehirVer("Ankara");
		System.out.println(yeniMesajSehir);
		
		int sayi = topla(6667567, 1);
		System.out.println(sayi);
		
		int toplam = variableArgumentsEx(2, 3, 4, 5);
		System.out.println(toplam);
	}

	// Void herhangi bir deðer döndürmez	
	public static void ekle() {
		System.out.println("Eklendi");
		
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	public static String sehirVer(String sehir) {		
		return "Ankara";
	}
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
		
	}
	public static int variableArgumentsEx(int... sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam += i;
		}
		return toplam;
	}

}
