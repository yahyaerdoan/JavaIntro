
public class asalSayiHesapla {

	public static void main(String[] args) {
		// Asal say� hesaplama
		
		int number = 29;
		int remainder = number % 2;
		System.out.println(remainder);
		
		boolean isPrime = true;	
		if (number == 1) {
			System.out.println("Say� asal de�ildir.");
		}
		if (number<1) {
			System.out.println("Ge�ersiz say�.");
			return;
		}
		for (int i = 2; i < number;i++) {
			if (number % 2 == 0) {
				isPrime = false;
				
			}			
		}
		if (isPrime == true) {
			System.out.println("Say� asald�r.");
		}else {
			System.out.println("Say� asal de�ildir.");
		}

	}

}
