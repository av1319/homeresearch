package assign;

import java.util.Scanner;

public class Student {

	private String name;
	private String id;
	private double grade;

	public Student(String name, String id, double grade) {
		this.name=name;
		this.id=id;
		this.grade=grade;
		
	}

	public Student(String name, String id) {
		this(name,id,0.0);
		this.name=name;
		this.id=id;
		
	}

	public Student(String id) {
		this("Nucleus",id);
		
		this.id=id;
		

	}

	public void display() {
		System.out.println("Name "+name+" id "+id+" grade "+grade);
	}

	public void display(int year) {
		display();
		System.out.println("year "+year);
		
	}

}

class Application {

	public static void main(String[] args) {
		String name,id;
		double grade;
		int choice;
		int year=0,i;
		Scanner s = new Scanner(System.in);
		Student student=null;
		
		
		
		
		do {
			System.out.println("Enter 1 for Object Creation \n 2 for display\n press any key to terminate");
			choice=s.nextInt();
			switch(choice) {
			case 1:
			
				System.out.println("press 1 to enter for student id\n2 for Student name & id\n3 for student id,name,grade");
				i=s.nextInt();
				if(i==1) {System.out.println("Enter id");
					id=s.next();	
					student=new Student(id);
				}
				else if (i==2) {
					System.out.println("Enter id,name");
					id=s.next();
					name=s.next();
					student=new Student(name,id);
				}
				else if (i==3) {
					System.out.println("Enter id,name,grade");
					id=s.next();
					name=s.next();
					grade =s.nextDouble();
					student=new Student(name, id, grade);
				}
				break;
			case 2:
				if(student !=null) {
					System.out.println("enter current year");
					do{
						year=s.nextInt();
					
					if(year==2018) {
						student.display(year);
					}
						
					else {
						System.out.println("Please Enter current year");
					}
				}while(year!=2018);
				}
				else {
					System.out.println("Please go for Object Creation\n\n");
				}
				break;
			
			
			}
			
		} while (choice==1 || choice==2);
		

	}

}