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

	//�NNER class metodu best practis de�il clean cod de�il
	//Solidin single responsibilyt princeble maddedsine ayk�rd�r.
	// her i� kendi class�nda yap�lmal�d�r.
	public static class connection {
		public static void createConnection() {

		}

	}
}
