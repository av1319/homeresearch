package assignment1_day1;
import java.util.*;
public abstract class OpenClass {

	abstract void open();
	
}

class Door extends OpenClass
{
	void open () {
		
		System.out.println("This is meant to open a Door");
	}
	
	
}

class Window extends OpenClass
{
	void open () {
		
		System.out.println("This is meant to open a Window");
	}
	
	
}

class Conversation extends OpenClass
{
	void open () {
		
		System.out.println("This is meant to open a Conversation");
	}
	
	
}

class Box extends OpenClass
{
	void open () {
		
		System.out.println("This is meant to open a box");
	}
	
	
}

class BankAccount extends OpenClass
{
	void open () {
		
		System.out.println("This is meant to open a Bank Account");
	}
	
	
}

class TestOpen
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int c;
		OpenClass op=null;
		do {
			System.out.println("\nEnter your choice to open");
			System.out.println("Enter 1 for door");
			System.out.println("Enter 2 for window");
			System.out.println("Enter 3 conversation");
			System.out.println("Enter 4 box");
			System.out.println("Enter 5 for Bank Account");
			System.out.println("Press any numeric key to exit");
			c=s.nextInt();
			switch(c) {
			
			case 1:
				op= new Door();
				op.open();
				break;
			case 2:
				op= new Window();
				op.open();
				break;
			case 3:
				op= new Conversation();
				op.open();
				break;
			case 4:
				op= new Box();
				op.open();
				break;
			case 5:
				op= new BankAccount ();
				op.open();
				break;
				
				default : System.out.println("Please enter valid choice");
				System.exit(1);
		
			
			}
			
			
		}while(true);
		
	}
	
	
	
}