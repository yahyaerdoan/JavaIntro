package classes;

public class Main {

	public static void main(String[] args) {
		//referance type / referans tip
		//referans tipin de�eri heap alan�nda olu�turulur.
		//diziler referans tiptir
		CustomerManager customerManager; //= new CustomerManager(); yazsak da silsek de durum ayn� 
		CustomerManager deneme = new CustomerManager();
		customerManager = deneme;
		customerManager.add();
		
		//Say�lar bir ve say�lar iki diye Intagerr olu�turduk. 
		//�imdi buray� do�ru okumak gerekiyor. Say�lar ikinin de�eri = say�lar birdir. 
		//Yani demek oluyor ki say�lar birin de�eri ve say�lar ikinin de�eri e�itleniyor. 
		//Say�lar birin s�f�r�nc� eleman�n�n de�eri on dur. 
		//Dolay�s�yla bunun ��kt�s�na bakt���m�zda say�lar ikinin s�f�r�nc� eleman�n�n de�eri on olmaktad�r.
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
		
		
		//value type / de�er tip
		//de�er tipin de�eri steak alan�nda olu�turulur.
		int sayi1 = 10;
		int sayi2 = 20;		
		sayi2 = sayi1; //sayi2'nin de�eri sayi1'dir.
		sayi1 = 30;
		System.out.println(sayi2); //sayi2 10'dur.

	}
	
}
