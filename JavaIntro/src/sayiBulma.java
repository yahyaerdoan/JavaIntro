
public class sayiBulma {

	public static void main(String[] args) {
		// say� bulmak

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
			System.out.println("Say� mevcuttur.");
		} else {
			System.out.println("Say� mevcut de�ildir.");
		}
	}

}
