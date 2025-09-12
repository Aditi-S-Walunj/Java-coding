package abc;
// Create a Laptop class with fields: brand, ramSize, price. Write getters and setters with validation
class Laptop{
	private String Brand;
	private String ramSize;
	private int price;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getRamSize() {
		return ramSize;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class Laptopencapsulation {
public static void main(String[] args) {
	Laptop l1=new Laptop();
	l1.setBrand("Asus Vivobook");
	l1.setRamSize("16 GB");
	l1.setPrice(50000);
	System.out.println("Laptop Brand:"+l1.getBrand());
	System.out.println("Laptop Ram Size:"+l1.getRamSize());
	System.out.println("Laptop Price:"+l1.getPrice());
}
}
