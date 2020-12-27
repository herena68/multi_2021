package ex;

public class Prob6_Book {
	public static void main(String[] args) {
		//도서관리 프로 그램 
        BookMgr mgr = new BookMgr(5);
        mgr.printBookList();
        mgr.addBook(new Book("java",900));
        mgr.addBook(new Book("sql",1900));
        mgr.addBook(new Book("jsp",2900));
        mgr.addBook(new Book("spring",22900));
        mgr.addBook(new Book("servlet",2900));
        mgr.addBook(new Book("hadoop",9900));
        mgr.printBookList();
        Book result = mgr.searchBook("p");
        if(result != null) result.print();
        else System.out.println("Servlet X ");
	}
}

class Book{
	private String title;
	private int price;
	
	public Book() {	}
	public Book(String title, int price) {
		//super();
		this.title = title;
		this.price = price;
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
	
	public void print() {
		System.out.printf("Book[%s:%d]%n",title,price);
	}
}

class BookMgr{
	private int cnt=0;
	private Book[] bookList;
	public BookMgr() {
		//초기화 작업 , 배열사용 준비작업
		bookList = new Book[10];
	}
	public BookMgr(int size) {
		bookList = new Book[size];
	}
	public BookMgr(Book[] bookList) {
		this.bookList = bookList;
	}
	
	public Book[] getBookList(String pw) {
		return bookList;
	}
	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}

	
	
	
	public void printBookList(){
		System.out.println("**** Book List ****");
		if(cnt==0) {
			System.out.println("데이터 없음");
			return;
		}
		for(int i =0;i<cnt ;i++) {
			System.out.println(bookList[i].getTitle());
		}
	
	}
	
	public void addBook(Book book) {
		if(cnt == bookList.length) {
			Book[] temp = new Book[ bookList.length*2];
			System.arraycopy(bookList, 0, temp, 0,bookList.length);
			bookList = temp;
			temp=null;
		}
		bookList[cnt] = book;
		cnt++;
	}
	     //Book[] 
	public Book searchBook(String title) {
		Book data=null;
		for(int i=0;i<cnt;i++) {
			//if(bookList[i].getTitle().contains(title)) {
			if(bookList[i].getTitle().toUpperCase()
					.contains(title.toUpperCase())) {
				data = bookList[i];
			}
		}
		return data;
	}
}





