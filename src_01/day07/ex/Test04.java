package day07.ex;

public class Test04 {
	public static void main(String[] args) {
		Person[] p = { 
				       new Employee("홍길동", 22, "행정실"), 
				       new Student("김길동", 20, 1), 
				       new Student("최길동", 20, 2), 
				       new Student("박길동", 20, 3), 
				       new Student("이길동", 20, 4), 
				       new Teacher("고선생", 40, "java "),
				       new Teacher("이선생", 42, "SQL ")
		};
		
		for(Person data:p) {
			personPrint(data);
		}
		System.out.println("-----Student List  ----");
		for(int i=0;i<p.length;i++) {
			// p배열에서 Student 객체만 찾아서 학생이름만 출력합니다.
			if(p[i] instanceof Student) {
				System.out.print("학번 : "+((Student)p[i]).getId());
				System.out.println(p[i].getName().charAt(0)+"**");
				Student s = (Student) p[i];
			}
		}
        System.out.println("------------------");
	}

	public static void personPrint(Person e) {
		e.print();
	}

}
