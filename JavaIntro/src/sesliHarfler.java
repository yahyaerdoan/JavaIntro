
public class sesliHarfler {

	public static void main(String[] args) {
		// Kal�n ve ince sesli harfler
		
		char harf = 'I';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n sesli harf");
			break;

		default:
			System.out.println("�nce sesli harf");;
		}

	}

}
