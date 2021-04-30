package classes;

public class Main {

	public static void main(String[] args) {
		//referance type / referans tip
		//referans tipin değeri heap alanında oluşturulur.
		//diziler referans tiptir
		CustomerManager customerManager; //= new CustomerManager(); yazsak da silsek de durum aynı 
		CustomerManager deneme = new CustomerManager();
		customerManager = deneme;
		customerManager.add();
		
		//Sayılar bir ve sayılar iki diye Intagerr oluşturduk. 
		//Şimdi burayı doğru okumak gerekiyor. Sayılar ikinin değeri = sayılar birdir. 
		//Yani demek oluyor ki sayılar birin değeri ve sayılar ikinin değeri eşitleniyor. 
		//Sayılar birin sıfırıncı elemanının değeri on dur. 
		//Dolayısıyla bunun çıktısına baktığımızda sayılar ikinin sıfırıncı elemanının değeri on olmaktadır.
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
		
		
		//value type / değer tip
		//değer tipin değeri steak alanında oluşturulur.
		int sayi1 = 10;
		int sayi2 = 20;		
		sayi2 = sayi1; //sayi2'nin değeri sayi1'dir.
		sayi1 = 30;
		System.out.println(sayi2); //sayi2 10'dur.

	}
	
}
