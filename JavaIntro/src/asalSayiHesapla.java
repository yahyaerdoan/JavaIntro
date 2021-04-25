
public class asalSayiHesapla {

	public static void main(String[] args) {
		// Asal sayı hesaplama
		
		int number = 29;
		int remainder = number % 2;
		System.out.println(remainder);
		
		boolean isPrime = true;	
		if (number == 1) {
			System.out.println("Sayı asal değildir.");
		}
		if (number<1) {
			System.out.println("Geçersiz sayı.");
			return;
		}
		for (int i = 2; i < number;i++) {
			if (number % 2 == 0) {
				isPrime = false;
				
			}			
		}
		if (isPrime == true) {
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir.");
		}

	}

}
