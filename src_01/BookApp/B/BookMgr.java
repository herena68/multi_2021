package BookApp.B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;


public class BookMgr {
	Map<Integer, Book> booklist = new HashMap<Integer, Book>();
	Scanner keyboard = new Scanner(System.in);
	public BookMgr()	{}
	
	public void addBook()	{
		System.out.println("책 정보 입력");
		System.out.println("1. ISBM");
		int isbm = Integer.parseInt(keyboard.nextLine());
		System.out.println();
		System.out.println("2. 책 제목");
		String title = keyboard.nextLine();
		System.out.println();
		System.out.println("3. 책의 가격");
		int price = Integer.parseInt(keyboard.nextLine());
		Book book = new Book(isbm, title, price);
		booklist.put(isbm, book);
	}
	public void updateBook()	{
		System.out.println("책의 ISBM을 입력하세요");
		int isbm = Integer.parseInt(keyboard.nextLine());
		if(booklist.containsKey(isbm))	{
			System.out.println("원하시는 작업을 선택하세요");
			System.out.println("1. 책 가격 변경      2. 책 이름 변경");
			int choice = Integer.parseInt(keyboard.nextLine().trim());
			switch(choice)	{
				case 1:
					System.out.println("새 가격을 입력하세요");
					int price = Integer.parseInt(keyboard.nextLine());
					booklist.get(isbm).setPrice(price);
					break;
				case 2:
					System.out.println("새 이름을 입력하세요");
					String title = keyboard.nextLine();
					booklist.get(isbm).setTitle(title);
				default:
					System.out.println("다시 입력해주세요");
			}
		}
	}
	public void removeBook()	{
		System.out.println("책의 ISBM을 입력하세요");
		int isbm = Integer.parseInt(keyboard.nextLine());
		booklist.remove(isbm);
	}
	public void searchBook()	{
		System.out.println("책의 ISBM을 입력하세요");
		int isbm = Integer.parseInt(keyboard.nextLine());
		booklist.forEach(new BiConsumer<Integer, Book>() {
			public void accept(Integer i, Book b) {
				if(isbm == i)	{
					System.out.println(b);
				}
			}
		});
	}
	
	public void printAll()	{
		booklist.forEach((i, b) -> System.out.println(b));
	}
	
}
