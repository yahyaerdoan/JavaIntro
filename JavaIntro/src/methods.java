
public class methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		
		int[] sayilar = new int [] {1, 2, 3, 4, 5, 6};
		int aranacak = 6;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
			
		}
		if (varMi) {
			mesajVer("Say� mevcuttur : " + aranacak);
		} else {
			System.out.println("Say� mevcut de�ildir : " + aranacak);
		}
	}
	private static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
