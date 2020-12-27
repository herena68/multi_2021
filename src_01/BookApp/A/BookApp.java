package BookApp.A;

import java.io.File;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title;
		int price;
		BookMgr bookMgr;
		String menu;
		
		System.out.print("1.새로입력\n2.불러오기\n");
		System.out.print("menu : ");
		menu = scanner.nextLine();
		if(menu == null || menu.length() == 0)
			menu = "99";
		
		if(menu.charAt(0) == '2') {
			System.out.printf("파일 이름 입력 : ");
			String file = scanner.nextLine();
			bookMgr = new BookMgr(new File(file));
		}
		else {
			bookMgr = new BookMgr();
		}
		
		while(true) {
			System.out.println("***************************");
			System.out.println("*****Book Application******");
			System.out.println("***************************");
			System.out.println("원하는 메뉴 번호를 입력하세요..");
			System.out.println("1.입력\n2.수정\n3.삭제\n4.검색\n5.목록보기\n6.저장\n7.종료");
			System.out.println("***************************");
			System.out.print("menu : ");
			menu = scanner.nextLine();
			if(menu == null || menu.length() == 0)
				menu = "99";
			switch (menu.charAt(0)) {
			case '1':
				System.out.print("제목 : ");
				title = scanner.nextLine();
				System.out.println("가격 : ");
				price = scanner.nextInt();
				scanner.nextLine();
				
				if(bookMgr.addBook(title, price))
					System.out.println("입력 되었습니다.");
				break;
			case '2':
				System.out.print("제목 : ");
				title = scanner.nextLine();
				System.out.print("수정할 가격 : ");
				price = scanner.nextInt();
				scanner.nextLine();
				
				if(bookMgr.replaceBook(title, price))
					System.out.println("수정 되었습니다.");
				break;
			case '3':
				System.out.print("삭제 : ");
				title = scanner.nextLine();
				
				if(bookMgr.deleteBook(title))
					System.out.println("삭제 되었습니다.");
				break;
			case '4':
				System.out.print("검색 : ");
				title = scanner.nextLine();
				
				bookMgr.searchBook(title);
				break;
			case '5':
				bookMgr.printBookList();
				break;
			case '6':
				System.out.printf("파일 이름 : ");
				String file = scanner.nextLine();
				if(bookMgr.saveBook(file))
					System.out.println("저장 되었습니다.");
				break;
			case '7':
				System.out.println("종료 합니다.");
				scanner.close();
				scanner = null;
				System.exit(0);
				break;
			default:
				System.out.println("올바른 키가 아닙니다.");
				break;

			}
		} 

	}

}
