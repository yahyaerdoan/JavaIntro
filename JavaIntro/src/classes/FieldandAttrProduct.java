package classes;

public class FieldandAttrProduct {

	//constructor yaps�
	public  FieldandAttrProduct(String yeniOzellik) {
		System.out.println("yap�c� blok �al��t�");
	}
	
	public int id;
	public String name;
	public String description;
	public double price;
	
	//private nesneyi public hale getibiliyor ya da private get set yapabiliyoruz.
	private String yeniOzellik;
	
	//get
	public String getYeniOzellik() {
		return yeniOzellik;
	}
	//set
	public void setYeniOzellik(String yeniOzellik) {
		this.yeniOzellik = yeniOzellik;
	}
}

