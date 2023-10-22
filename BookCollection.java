package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
	
	//Create a static method that will return the collection list.
	
	public static List<Book> createList(){
		
		// create list using generic
		List<Book> list = new ArrayList<>();
		
		// call all the methods in a sequence by using Java Stream.
		Book b1 = BookBuilder.createObj().setBookId(145).setBookName("Atomic Habbit").setBookType("Novel")
				.setBookPrice(450).Build();
		
		Book b2 = BookBuilder.createObj().setBookId(125).setBookName("The Monk who sold his farrari")
				.setBookType("Novel")
				.setBookPrice(500).Build();
		
		// pass all the object inside list using add method
		list.add(b1);
		list.add(b2);
		
		return list;
	}
}
