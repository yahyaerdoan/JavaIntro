
public class mukemmelSayi {

	public static void main(String[] args) {
		// Mükemmel sayý, sayýlar teorisinde, kendisi hariç pozitif tam bölenlerinin
		// toplamý kendisine eþit olan sayý. Diðer bir ifadeyle, bir mükemmel sayý,
		// bütün pozitif tam bölenlerinin toplamýnýn yarýsýna eþittir.

		int number = 27;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}

		}
		if (total == number) {
			System.out.println(number + " : Mükemmel sayýdýr.");
		} else {
			System.out.println(number + " : Mükemmel sayý deðildir.");
		}
	}

}
