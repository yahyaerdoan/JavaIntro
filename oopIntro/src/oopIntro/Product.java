package oopIntro;

public class Product {

	// Constractor : yap�c� blok, hayati �neme sahip

	public Product() {
		System.out.println("Ben �al��t�m");
	}

	public Product(int productId, String name, double unitPrice, String detail) {
		this.productId = productId;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;

	}

	int productId;
	String name;
	double unitPrice;
	String detail;
}
