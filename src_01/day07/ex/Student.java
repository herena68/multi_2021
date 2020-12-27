package day07.ex;

public class Student extends Person {
	private int id;

	public Student(String name, int age) {
		super(name, age);
	}

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		super.print();
		System.out.printf("[Student] 학    번 : %d\n", id);
	}
}
