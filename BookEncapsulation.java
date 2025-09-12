package abc;

class Book{
	private String title;
	private String author;
	private int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class BookEncapsulation {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setTitle("Shyam chi aai");
		b1.setAuthor("Sane Guruji");
		b1.setPrice(79);
		System.out.println("Book Title:"+b1.getTitle());
		System.out.println("Book Author:"+b1.getAuthor());
		System.out.println("Book Price:"+ b1.getPrice());
	}
}

