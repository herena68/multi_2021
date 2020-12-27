package ex;

public class Prob7 {
	public static void main(String[] args) {
         Person[] p = {
        		 new Teacher("김선생", 34, "java"),
        		 new Student("김학생", 21, 17),
        		 new Employee("김사원", 32, "관리부")
         };
	       for(Person data:p) {
	           data.print();
	       }         
//         for(Person data:p) {
//        	if(data instanceof Employee) ((Employee)data).print();
//        	if(data instanceof Teacher) ((Teacher)data).print();
//        	if(data instanceof Student) ((Student)data).print();
//         }
	}
}

class Person{
	protected String name;
	protected int age;
	
	public Person() {	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void print() {
    	System.out.printf("이름: %s 나이:%s ",name,age);
	}
	
}
class Student extends Person{
	int id;
	public Student() {
		super();
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
	@Override
	public void print() {
		super.print();
    	System.out.printf(" %s %n",id);
    }
}
class Teacher extends Person{
	
	String subject ;
	public Teacher() {	}
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
	@Override
	public void print() {
		super.print();
    	System.out.printf(" %s %n",subject);
    }
}

class Employee extends Person{
	
	String dept;
    
	public Employee() {
		super();
	}
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public void print() {
		super.print();
    	System.out.printf(" %s %n",dept);
    }
}




