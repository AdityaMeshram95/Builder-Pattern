package BuilderPattern;

public class BookBuilder {
	// Create a reference variable of book class as instance variable inside Builder class.
	private Book b;
	
	// COnstructor.
	public BookBuilder(Book b) {
		this.b = b;
	}
	
	// Create a static method that will return the object inside constructor.
	public static BookBuilder createObj() {
		return new BookBuilder(new Book());
	}
	
	// Create a method that will return assign the value inside base class method.
	public BookBuilder setBookId(int bookId) {
		b.setBookId(bookId);
		return this;
	}
	
	public BookBuilder setBookName(String bookName) {
		b.setBookName(bookName);
		return this;
	}
	
	public BookBuilder setBookType(String bookType) {
		b.setBookType(bookType);
		return this;
	}
	
	public BookBuilder setBookPrice(double bookPrice) {
		b.setBookPrice(bookPrice);
		return this;
	}
	
	// Create a method that will return the reference variable of base class.
	public Book Build() {
		return b;
	}
}
