package BuilderPattern;

public class Book { // Base class.
	// Instance variable
	private int bookId;
	private String bookName;
	private String bookType;
	private double bookPrice;
	
	// Setter Getter method.
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	// toString method to return the String representation of object.
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ",\nbookName=" + bookName + ",\nbookType=" + bookType + ",\nbookPrice="
				+ bookPrice + "]";
	}
}
