
public class arraysDiziler {

	public static void main(String[] args) {
		// Diziler

		String ogreci1 = "Yahya";
		String ogreci2 = "Erdo�an";
		
		System.out.println(ogreci1);
		System.out.println(ogreci2);
		System.out.println("--------");
		
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Yahya";
		ogrenciler[1] = "Erdo�an";
		ogrenciler[2] = "Meryem";
		ogrenciler[3] = "Erdo�an";
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);			
		}
		//bu kod tekni�i k�t� kod olup kullan�m� zordur.
		
		System.out.println("----bestPractis----");
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		// bu kod daha kullan�labilir ve kolayd�r.
	}

}
