import java.util.Scanner;

public class Miniproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char repeat = 'y';
		Scanner sc = new Scanner(System.in);
		
		while (repeat == 'y' || repeat == 'y') {
			
			System.out.println("1.Addition program");
			System.out.println("2.Swap program");
			System.out.println("3.Even odd finding");
			System.out.println("4.Printing reverse");
			System.out.println("5.Printing table for each digit of given number");
			System.out.println("6.Palindrome");
			System.out.println("7.Prime number");
			System.out.println("8.Armstrong numbrt");
			System.out.println("9.Grade");
			System.out.println("10.Months");
			System.out.println("11.Positive number");
			System.out.println("12.Marriage eligilibility");
			System.out.println("for git");
			
			
			System.out.println("Please select your choice of program : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: addition();break;
			case 2: Swap();break;
			case 3: evenodd();break;
			case 4: reversenumber();break;
			case 5: table();break;
			case 6: palindrome();break;
			case 7: prime();break;
			case 8: armstrong();break;
			case 9: grade();break;
			case 10: months();break;
			case 11: positivenumber();break;
			case 12: marriageEligilibility();break;
			
			default: System.out.println("Enter choice is wrong....");
			}
		System.out.println("Do you want to continue......");
		repeat = sc.next().charAt(0);
		}
		
	System.out.println("********************Thanks for trying my project....visit again***********");
	}
}

//marriage eligibility
p