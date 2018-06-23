package assignment1_day1;

import java.util.Scanner;

public abstract class CarDealer {
	abstract void modelOfCategory();
	
}


class Suv extends CarDealer{
	
	void modelOfCategory() {
		
		System.out.println("We have Tata Safari in this section");
	}
	
	
}

class Mini extends CarDealer{
	
	void modelOfCategory() {
		
		System.out.println("We have Tata Nano in this section");
	}
	
	
}

class Sedan extends CarDealer{
	
	void modelOfCategory() {
		
		System.out.println("We have Tata Indigo in this section");
	}
	
	
}

class Economy extends CarDealer{
	
	void modelOfCategory() {
		
		System.out.println("We have Tata Indica in this section");
	}
	
	
}

class TestCar
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int c;
		CarDealer cd=null;
		do {
			System.out.println("\nEnter your choice for model of car");
			System.out.println("Enter 1 for SUV");
			System.out.println("Enter 2 for SEDAN");
			System.out.println("Enter 3 ECONOMY");
			System.out.println("Enter 4 MINI");
			System.out.println("Press any numeric key to exit");
			c=s.nextInt();
			switch(c) {
			
			case 1:
				cd= new Suv();
				cd.modelOfCategory();
				break;
			case 2:
				cd= new Sedan();
				cd.modelOfCategory();
				break;
			case 3:
				cd= new Economy();
				cd.modelOfCategory();
				break;
			case 4:
				cd= new Mini();
				cd.modelOfCategory();
				break;
			
				
				default : System.out.println("Please enter valid choice");
				System.exit(1);
		
			
			}
			
			
		}while(true);
		
	}
	
	
	
}
