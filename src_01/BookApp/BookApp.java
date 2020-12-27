package BookApp;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
		while (true) {
			System.out.println("******************************    ***");
			System.out.println("********** Book Application  *******");
			System.out.println("**** *********************   ********");

			System.out.println("원하는 메뉴 번호를 입력하세요 ..");
			System.out.println("1. 입   력 ");
			System.out.println("2. 수   정");
			System.out.println("3. 삭   제");
			System.out.println("4. 검   색");
			System.out.println("5. 목록보기");
			System.out.println("6. 종   료");

			System.out.println("******************************    ***");
			
			String input = keyboard.nextLine();
			
			if(input == null || input.length()==0) {
				input = "99";
			}
			
			switch(input.charAt(0)) {
			  case '1':
				  System.out.println("1. 입   력  서비스 ");
				  break;
			  case '2':
				  System.out.println("2. 수   정 서비스");

				  break;
			  case '3':
				  System.out.println("3. 삭   제 서비스");

				  break;
			  case '4':
				  System.out.println("4. 검   색 서비스");

				  break;
			  case '5':
				  System.out.println("5. 목록보기 서비스");

				  break;
			  case '6':
				  System.out.println("Application 종료합니다.");
				  System.exit(0);
				  break;
			  default:
				  System.out.println("잘못입력하셨습니다.");
				  System.out.println("1~6 번호를 입력하세요");
				  break;
				  
			}
			
		}
	}
}







