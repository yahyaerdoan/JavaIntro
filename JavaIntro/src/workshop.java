
public class workshop {

	public static void main(String[] args) {
		// genel tekrar �al��mas� diziler

		double[] myList = new double[2]; // array yazman�n 1. y�ntemi a�a��daki ise 2. y�ntemdir.
		myList[0] = 2.5;
		myList[1] = 5.6;
		

		//iksinin aras�nda sadece yaz�m farkl�d�r. ayn� array dizisini ifade eder.
		//Bu tan�mlama �eklinin fark� ise istedi�imiz kadar de�er girebiliriz. 
		//Bu elemanlara ula�mak i�in indeks kullanabiliriz. 
		//�rne�in; sehirler[0] yazd���m�zda bize 1.2 sonucunu verecektir. 
		//Ya da bir for d�ng�s� ile b�t�n de�erlerimizi ekrana yazd�rabiliriz
		//Toplam ve En b�y�k say�y� yazd�rd�k.

		double[] myList2 = { 1.2, 3.4, 5.6, 6.8 };
		double total = 0;
		double max = myList2[0];
		for (double number : myList2) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam =" + total);
		System.out.println("En b�y�k say� =" + max);
	}

}
