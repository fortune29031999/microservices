package collections1;

public class Phone {
	private String brand;
	private	int price;
	private String colour;
	private	int editionyear;
	private float Rating;
	
	public  Phone(String brand,int price,String colour,int editionyear,float Rating) {
		this.brand=brand;
		this.price=price;
		this.colour=colour;
		this.editionyear=editionyear;
		this.Rating=Rating;
	}
	public String toString() {
		return brand+" "+price+" "+colour+" "+editionyear+" "+Rating; 
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getEditionyear() {
		return editionyear;
	}
	public void setEditionyear(int editionyear) {
		this.editionyear = editionyear;
	}
	public float getRating() {
		return Rating;
	}
	public void setRating(float rating) {
		Rating = rating;
	}
	
}
