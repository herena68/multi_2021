package day07.ex;

public class Teacher extends Person {
	private String subject;

	public Teacher(String name, int age) {
		super(name, age);
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		super.print();
		System.out.printf("[Teacher]  담당과목 : %s\n", subject);
	}
}
