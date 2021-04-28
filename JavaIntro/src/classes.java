import classes.CustomerManager;
import classes.DortIslem;
import classes.FieldandAttrProduct;
import classes.FieldandAttrProductManager;
import classes.overLoadingMethods;


public class classes {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();

		
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 5);
		System.out.println(sonuc);
		
		
		FieldandAttrProduct attrProduct =new FieldandAttrProduct("yeniOzellik");
		attrProduct.id = 1;
		attrProduct.name = "Elma";
		attrProduct.description = "Güzel";
		attrProduct.price = 2;
		
		attrProduct.getYeniOzellik(); //Sdece okutur
		attrProduct.setYeniOzellik("Sulu sulu"); // yazdýrýr ve okutur
		
		FieldandAttrProductManager attrProductManager = new FieldandAttrProductManager();
		attrProductManager.Add(attrProduct);
		
		//okuduk
		System.out.println(attrProduct.getYeniOzellik());
		
		overLoadingMethods loadingMethods = new overLoadingMethods();
		System.out.println(loadingMethods.Topla(2, 3));
		System.out.println(loadingMethods.Topla(1, 2, 3));
		
	}
	

}
