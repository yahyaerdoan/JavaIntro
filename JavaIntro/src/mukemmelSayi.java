
public class mukemmelSayi {

	public static void main(String[] args) {
		// M�kemmel say�, say�lar teorisinde, kendisi hari� pozitif tam b�lenlerinin
		// toplam� kendisine e�it olan say�. Di�er bir ifadeyle, bir m�kemmel say�,
		// b�t�n pozitif tam b�lenlerinin toplam�n�n yar�s�na e�ittir.

		int number = 27;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}

		}
		if (total == number) {
			System.out.println(number + " : M�kemmel say�d�r.");
		} else {
			System.out.println(number + " : M�kemmel say� de�ildir.");
		}
	}

}
