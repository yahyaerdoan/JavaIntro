
public class workshop {

	public static void main(String[] args) {
		// genel tekrar çalýþmasý diziler

		double[] myList = new double[2]; // array yazmanýn 1. yöntemi aþaðýdaki ise 2. yöntemdir.
		myList[0] = 2.5;
		myList[1] = 5.6;
		

		//iksinin arasýnda sadece yazým farklýdýr. ayný array dizisini ifade eder.
		//Bu tanýmlama þeklinin farký ise istediðimiz kadar deðer girebiliriz. 
		//Bu elemanlara ulaþmak için indeks kullanabiliriz. 
		//Örneðin; sehirler[0] yazdýðýmýzda bize 1.2 sonucunu verecektir. 
		//Ya da bir for döngüsü ile bütün deðerlerimizi ekrana yazdýrabiliriz
		//Toplam ve En büyük sayýyý yazdýrdýk.

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
		System.out.println("En büyük sayý =" + max);
	}

}
