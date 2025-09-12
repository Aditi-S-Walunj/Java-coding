package abc;

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
		if (ramSize > 0) {
		this.ramSize = ramSize;
	    } else {
            System.out.println("RAM size must be greater than 0!");
        }
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
	 if (price > 10000) {
		this.price = price;
	 } else {
        System.out.println("Price must be greater than 10000!");
        }
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

