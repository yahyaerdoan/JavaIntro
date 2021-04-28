package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenevo v14", 15000, "16 gb", 10, 13500);
				
		Product product2 = new Product();
		product2.setProductId(2);
		product2.setName("Casper");
		product2.setDetail("Yeni");
		product2.setDiscount(10);
		product2.setUnitPrice(100);
		
		System.out.println(product2.getUnitPriceAfterdiscount());
		
		Product[] products = {product1,product2,};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.setcategoryId(1);
		category1.setname("Ýçecek");
		
		Category category2 = new Category();
		category2.setcategoryId(2);
		category2.setname("Yiyecek");
		
		System.out.println(category1.getname());
		System.out.println(category2.getname());
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product2);
		
	

}
}