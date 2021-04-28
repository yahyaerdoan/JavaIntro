package oopIntro;

public class Category {

	private int categoryId;
	private String name;
	
	public Category() {
		super();
	}
	
	public Category(int categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}
	
	public int getcategoryId() {
		return this.categoryId;		
	}
	public void setcategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getname() {
		return this.name + "!";		
	}
	public void setname(String name) {
		this.name = name;
	}
	
}
