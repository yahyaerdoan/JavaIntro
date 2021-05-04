package innerAndStatic;

public class ProductManager {
	//static ara� class�n constructor�n� staticle �al��t�rabiliriz. 
	// static de�ilse public �al��t�r�r�z.
	static {
		System.out.println("Static yap�c� blok �al��t�");
	}
	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		} else {
			System.out.println("�r�n bilgileri ge�ersizdir!");
		}
	}
	// inner class i�in static kullanabiliriz.
	public 	static class InnerClass{
		public static void sil() {
			
		}
	}
}
