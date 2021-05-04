package innerAndStatic;

public class DatabaseHelper {

	public static class crud {
		public static void add() {

		}

		public static void delete() {

		}

		public static void update() {

		}

	}

	//ÝNNER class metodu best practis deðil clean cod deðil
	//Solidin single responsibilyt princeble maddedsine aykýrdýr.
	// her iþ kendi classýnda yapýlmalýdýr.
	public static class connection {
		public static void createConnection() {

		}

	}
}
