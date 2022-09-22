package Core_Java;

/*
 create a class Teacher with method teach and print Teaching subjects in that method.create class Students which will inherits
  the property of Teacher and has its own property Listen and print Listening to teacher in that method.create a main method and
   create an object of sub class and call teach and listen methods
 */
class Teacher{
	public void teach() {
		System.out.println("The subjects mentor is teaching are");
		System.out.println("1.Java");
		System.out.println("2.git");
		System.out.println("3.React");
	}
}

public class Student extends Teacher {
   public void listen() {
	   System.out.println("listeniing to mam");
   }
   public static void main(String[] args) {
	Student s=new Student();
	s.teach();
	s.listen();
}
}
