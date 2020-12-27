package day07.ex;

public class Test03 {
	public static void main(String[] args) {
		Person e1 = new Employee("홍길동", 22, "행정실");
		Person s1 = new Student("김길동", 20, 1);
		Person t1 = new Teacher("고길동", 40, "java ");
		
		Test03.personPrint(e1);
		Test03.personPrint(s1);
	}
	
	public static void personPrint(Person e) {
		e.print();
	}
	
}
