package Core_Java;

class Student_Details {
	private String name;
	private int rollno;
	private int age;
	
	//creating getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//creating a method tp print details of student
	public void display() {
		System.out.println("Showing details of Students");
		System.out.println("NAME- "+name);
		System.out.println("Roll Number- "+rollno);
		System.out.println("Age- "+age);
	}
	
}
