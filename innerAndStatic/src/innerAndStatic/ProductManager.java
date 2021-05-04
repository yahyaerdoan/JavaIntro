package innerAndStatic;

public class ProductManager {
	//static araç classýn constructorýný staticle çalýþtýrabiliriz. 
	// static deðilse public çalýþtýrýrýz.
	static {
		System.out.println("Static yapýcý blok çalýþtý");
	}
	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		} else {
			System.out.println("Ürün bilgileri geçersizdir!");
		}
	}
	// inner class için static kullanabiliriz.
	public 	static class InnerClass{
		public static void sil() {
			
		}
	}
}
