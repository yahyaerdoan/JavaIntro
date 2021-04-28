package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenevo v14", 15000, "16 gb");
		
		
		Product product2 = new Product();
		product2.productId =2;
		product2.name = "Lenevo v15";
		product2.detail = "18 gb";
		product2.unitPrice = 12.00;
		
		Product product3 = new Product();
		product3.productId =3;
		product3.name = "Hp v14";
		product3.detail = "32 gb";
		product3.unitPrice = 11.00;
		
		Product product4 = new Product();
		product4.productId =4;
		product4.name = "Apple v14";
		product4.detail = "54 gb";
		product4.unitPrice = 155.00;
		
		Product[] products = {product1,product2,product3,product4};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.categoryId =1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.categoryId =1;
		category2.name = "Bilgisayar";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product4);
		
	

}
}