package abc;

interface ProductInterface {
}
class Product implements ProductInterface {
	private int productId;
	private String productName;
	private double productCost;
	private int productQuantity;
	private static int objectCount = 0;
	public Product() {
		productId = 0;
		productName = "NO name";
		productCost = 0.0;
		productQuantity = 0;
		objectCount++;
	}
	public Product(int productId, String productName, double productCost, int productQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.productQuantity = productQuantity;
		objectCount++;
	}
	public void displayProduct() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Cost: " + productCost);
		System.out.println("Product Quantity: " + productQuantity);
	}
	public static int getObjectCount() {
		return objectCount;
	}
}
public class InterfaceAccessModifiers {
	public static void main(String[] args) {
		Product product1 = new Product();
		Product product2 = new Product(101, "Laptop", 50000.0, 10);

		product1.displayProduct();
		product2.displayProduct();

		System.out.println("Total Product Objects: " + Product.getObjectCount());
	}
}
