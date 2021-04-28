package oopIntro;

public class Product {

	// Constractor : yapýcý blok, hayati öneme sahip

	private int productId;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;	
	
	public Product() {
		super();
	}

	public Product(int productId, String name, double unitPrice, String detail, double discount,
	double unitPriceAfterdiscount) {
		super();
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterdiscount() {
		return this.unitPrice-(this.unitPrice * this.discount / 100);
	}
}
