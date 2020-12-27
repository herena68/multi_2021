package BookApp.A;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class BookMgr {
	private Book<String, Integer> bookList;
	int count = 0;

	public BookMgr() {
		bookList = new Book<String, Integer>();
	}

	public BookMgr(File f) {
		this();
		try (Scanner scanner = new Scanner(f);) {
			while (scanner.hasNext()) {
				String[] data = scanner.nextLine().split("/");
				String title = data[0];
				int price = Integer.parseInt(data[1]);
				addBook(title, price);
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("예외 발생 했습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public boolean addBook(String title, int price) {
		if(bookList.containsKey(title)){
			System.out.println("중복된 데이터 입니다.");
			return false;
		}
		else {
			bookList.put(title, price);
			count++;
			return true;
		}
	}
	
	public boolean deleteBook(String title) {
		if(bookList.containsKey(title)) {
			bookList.remove(title);
			return true;
		}
		else {
			System.out.println("데이터가 존재하지 않습니다.");
			return false;
		}
	}
	
	public boolean replaceBook(String title, int newPrice) {
		if(bookList.containsKey(title)) {
			bookList.replace(title, newPrice);
			return true;
		}
		else {
			System.out.println("데이터가 존재하지 않습니다.");
			return false;
		}
	}
	
	public boolean searchBook(String title) {
		if(bookList.containsKey(title)) {
			System.out.printf(
					"[title : %s, price : %d]\n", title, bookList.get(title));
			return true;
		}
		else {
			System.out.println("데이터가 존재하지 않습니다.");
			return false;
		}
	}

	public void printBookList() {
		System.out.println("====== 책 목록 =======");
		bookList.forEach((title, price)->System.out.printf(
				"[title : %s, price : %d]\n", title, price));
	}

	public void printTotalPrice() {
		System.out.println("==== 책 가격의 총합 ====");
		int sum = 0;
		sum = bookList.values().stream().mapToInt(p->p).sum();
		System.out.printf("총합 : %d", sum);
	}
	
	public boolean saveBook(String file) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file, false);
			Iterator<Entry<String, Integer>> it = bookList.entrySet().iterator();
			String line = "";
			while(it.hasNext()) {
				line = line.concat(it.next().toString().replace('=', '/').concat("\n"));
				System.out.println(line);
			}
			byte[] b = line.getBytes();
			
			try {
				fos.write(b);
				return true;
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}

	}
			
	
}
