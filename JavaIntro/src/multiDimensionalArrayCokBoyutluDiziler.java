
public class multiDimensionalArrayCokBoyutluDiziler {

	public static void main(String[] args) {
		// �ok boyutlu diziler.
		//[]tek sat�rdan olu�an array 
		//[][] s�tundan da olu�an bir array�m�z olsun istiyorsak �ift yapmal�y�z
		//Uygulamalarda daha �ok kullan�lan iki boyutlu dizilerdir. �ki boyutlu diziler �matris� olarak da isimlendirilir.
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "�stabnul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bal�kesir";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Denizli";
		sehirler[2][1] = "U�ak";
		sehirler[2][2] = "�zmir";
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("-----------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
			
		}

	}

}
