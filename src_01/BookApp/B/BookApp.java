package BookApp.B;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		
		BookMgr bm = new BookMgr();
		while(true)	{
			System.out.println("***************************************");
			System.out.println("**********Book Application*************");
			System.out.println("***************************************");
			
			System.out.println("원하는 메뉴 번호를 입력하세요");
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 검색");
			System.out.println("5. 목록보기");
			System.out.println("6. 종료");
			
			Scanner keyboard = new Scanner(System.in);
			String input = keyboard.nextLine();
			if(input == null || input.length() == 0)
				input = "99";
			
			switch(input.charAt(0))	{
				case '1':
					bm.addBook();
					break;
				case '2':
					bm.updateBook();
					break;
				case '3':
					bm.removeBook();
					break;
				case '4':
					bm.searchBook();
					break;
				case '5':
					bm.printAll();
					break;
				case '6':
					System.out.println("Application을 종료합니다.");
					keyboard.close();
					System.exit(0);
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("1~6 사이의 번호를 입력하세요.");
			}
		}
	}
}
