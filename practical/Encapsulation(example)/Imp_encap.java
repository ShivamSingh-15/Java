package Core_Java;

public class Imp_encap {
	public static void main(String[] args) {
		//creating object of account_info
		Account_info acc=new Account_info();
		
		acc.setAcno(123456);
		acc.setName("Shivam Singh");
		acc.setAmount(450000);
		System.out.println("Hello user welcome to bank\nAccount number- "+acc.getAcno());
		System.out.println("Name- "+acc.getName());
		System.out.println("Amount- "+acc.getAmount());

		
		System.out.println();
		//creating object of class Student_Details
		Student_Details sd1=new Student_Details();
		sd1.setName("Shivam Singh");  //setting name
		sd1.setRollno(12);  //setting rollno
		sd1.setAge(23);   //setting age
		
		sd1.display();  //displaying details of student
		
	}

}
