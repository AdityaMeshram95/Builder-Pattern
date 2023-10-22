package BuilderPattern;

import java.util.List;
import java.util.function.Consumer;

public class BookTest {
	// Main method
	public static void main(String[] args) {
		
		// call the static method from collection class.
		List<Book> B = BookCollection.createList();
		
		// Print data using for-each loop
		for(Book b : B) {
			System.out.println(b);
			System.out.println();
		}
		
		//Printing data using forEach() method.
		System.out.println("-----------");
		B.forEach(x -> System.out.println(x));
		System.out.println("------------");
		
		// Printing data using Consumer class
		Consumer<Book> c = new Consumer<>() {
			
			@Override
			public void accept(Book x) {
				System.out.println(x);
			}
		};
		
		B.forEach(c);
	}
}
