
public class arraysDiziler {

	public static void main(String[] args) {
		// Diziler

		String ogreci1 = "Yahya";
		String ogreci2 = "Erdoðan";
		
		System.out.println(ogreci1);
		System.out.println(ogreci2);
		System.out.println("--------");
		
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Yahya";
		ogrenciler[1] = "Erdoðan";
		ogrenciler[2] = "Meryem";
		ogrenciler[3] = "Erdoðan";
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);			
		}
		//bu kod tekniði kötü kod olup kullanýmý zordur.
		
		System.out.println("----bestPractis----");
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		// bu kod daha kullanýlabilir ve kolaydýr.
	}

}
