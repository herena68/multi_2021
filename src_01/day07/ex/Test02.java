package day07.ex;

public class Test02 {
	public static void main(String[] args) {
		Employee e1 = new Employee("홍길동", 22, "행정실");
		Student s1 = new Student("김길동", 20, 1);
		Teacher t1 = new Teacher("고길동", 40, "java ");
		
		Test02.personPrint(e1);
		Test02.personPrint(s1);
	}
	
	public static void personPrint(Employee e) {
		e.print();
	}
	public static void personPrint(Student e) {
		e.print();
	}
	public static void personPrint(Teacher e) {
		e.print();
	}
}
