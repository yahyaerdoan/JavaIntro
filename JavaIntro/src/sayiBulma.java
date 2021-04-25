
public class sayiBulma {

	public static void main(String[] args) {
		// sayý bulmak

		int[] sayilar = new int [] {1, 2, 3, 4, 5};
		int aranacak = 7;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
			
		}
		if (varMi) {
			System.out.println("Sayý mevcuttur.");
		} else {
			System.out.println("Sayý mevcut deðildir.");
		}
	}

}
