
public class multiDimensionalArrayCokBoyutluDiziler {

	public static void main(String[] args) {
		// Çok boyutlu diziler.
		//[]tek satýrdan oluþan array 
		//[][] sütundan da oluþan bir arrayýmýz olsun istiyorsak çift yapmalýyýz
		//Uygulamalarda daha çok kullanýlan iki boyutlu dizilerdir. Ýki boyutlu diziler “matris” olarak da isimlendirilir.
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "Ýstabnul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Balýkesir";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Denizli";
		sehirler[2][1] = "Uþak";
		sehirler[2][2] = "Ýzmir";
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("-----------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
			
		}

	}

}
