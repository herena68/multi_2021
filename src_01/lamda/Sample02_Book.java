package lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sample02_Book {

	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("java",600));
		list.add(new Book("sql",900));
		list.add(new Book("Database",700));
		list.add(new Book("html",1600));
		list.add(new Book("js",6900));
		
		
		int sum = list.stream().filter(i -> i.getPrice()>5000).mapToInt(i->i.getPrice()).sum();
		System.out.println(sum);
		
		int count = (int) list.stream().filter(i -> i.getPrice()>5000).count();
		System.out.println(count);

		Stream.of(1,2,3,4,5,6,7,8,9)
		.filter(i -> (i%2==0))
		.forEach(i -> System.out.println(i));
		
		
		System.out.println("---------------------");
		Book[] books = {
				new Book("java",9900),
				new Book("sql",900),
				new Book("spring",19900),
				new Book("html5",300),
		};
		
		Stream.of(books)
		.filter(i -> i.getPrice()>9900)
		.forEach(i->System.out.println(i));
        System.out.println("----------------------");
        
		Stream.of(books)
		.sorted((i,j)->	i.price - j.price)
		.forEach(i->System.out.println(i));

		
	}

}

class Book{
	String title;
	int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public Book() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
}
