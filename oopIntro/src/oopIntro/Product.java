package oopIntro;

public class Product {

	// Constractor : yapýcý blok, hayati öneme sahip

	public Product() {
		System.out.println("Ben çalýþtým");
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
