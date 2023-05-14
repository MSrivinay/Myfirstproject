import java.util.Scanner;



public class tiny {



		public static void main(String[] args) {

			

			

			Scanner sc= new Scanner (System.in);

			int a= 10;
			int b = 20;

			int c[]= {10,11,12,13,14};

			char repeat = 'y';

			

			while (repeat == 'y' || repeat == 'Y') {

				

				System.out.println("1. Arthematic operators");

				System.out.println("2. Swapping Program");

				System.out.println("3. even or odd");

				System.out.println("4. Printing Reverse number");

				System.out.println("5. Printing table");

				System.out.println("6. Palindrome or not");

				System.out.println("7. Prime number or not");

				System.out.println("8. Armstrong number or not");

				System.out.println("9.months");

				System.out.println("10.positive number");

				

				

				System.out.println("Please select your choice of Program : ");

				

				int choice = sc.nextInt();



				switch(choice) {

					case 1: arthematic(a,b); break;

					case 2: swap(a,b); break;

					case 3: even(a); break;

					case 4: reverse(c); break;
				
					case 5: table(a); break;
					
					case 6: palindrome(a); break;

					case 7: prime(c); break;

					case 8: armstrong(c);break;

					case 9: months(a);break;

					case 10: positive(c);break;
				

					

					default: System.out.println("Enter choice is wrong ...");

				}

				

				System.out.println("Do you want to continue ?...." );

				repeat = sc.next().charAt(0);

			}

			

			System.out.println("******************Thanks for trying my Project*** Visit Again*********");
		}

	public static void arthematic(int a, int b) {
		Scanner sc = new Scanner(System.in);
		char operator = sc.next().charAt(0);
		
		if (operator=='+') {
			System.out.println("sum="+(a+b));
		}else if(operator=='-') {
			System.out.println("sub="+(a-b));
		}else if(operator=='/') {
			System.out.println("div="+(a/b));
		}else if(operator=='*') {
			System.out.println("mul="+(a*b));
		}else if(operator=='%') {
			System.out.println("modulus="+(a%b));
		}else {
			System.out.println("Enter a valid operator....");
		}
	}
	
	public static void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void even(int a) {
		if (a%2==0)
		{
			System.out.println("even");
		} else
		{
			System.out.println("odd");
		}
	}
	public static void reverse(int c[]) {
		for(int val:c) {
		 int duplicateNum = val;
		 int reverse = 0;
		 
		 for(;val != 0; val = val/10) {
			 int temp = val % 10;
			 reverse = reverse * 10 + temp;
		 }
				 System.out.println("the reverse number is : "+reverse);

	}
	}
	public static void table(int a) {
		for (int i=1; i<=10; i++) {
			
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
	public static void palindrome(int a) {
		int duplicateNum = a;
		int reverse = 0;
		
		while(a!=0) {
			int temp = a%10;
			reverse = reverse*10+temp;
			a = a/10;
		}
		System.out.println("the reverse of number is :"+reverse);
		
		if(duplicateNum==reverse) {
			System.out.println("It is palindrome....");
		}else {
			System.out.println("Not a palindrome....");
		}
	}
	public static void prime(int c[]) {
	
		for(int val:c) {
			boolean h = true;
			for(int i =2;i<val;i++) {
				if(val%i==0) h=false;}
			if(h) {
				System.out.println(val+" is  prime...");
			}else {
				System.out.println(val+" is not prime no....");
			
		}
	}
	}
	public static void armstrong(int c[]) {
		
		for(int val:c) {
			int numForCount = val;
			int amstrong=0;
			int copy = val ;
			
			//Block start for count preparation
			int count = 0;
			for (; numForCount != 0; numForCount/=10) count++;
			//Block ended for count preparation
			
			System.out.println("Number of digits : " + count);
			
			//Finding Amstrong logic started
			for(; val!=0;val=val/10) {
				int temp=val%10;
				 
				int mul = 1;
				for (int b=1; b<=count; b++)
					mul = mul * temp;
				
				amstrong = amstrong + mul;
			}
			//Finding Amstrong logic is ended
			
			//Amstrong comparison started
			if (copy==amstrong)
			    System.out.println("It is amstorng no");
			else
			   System.out.println("It is not amstrong no");
			}
	}
	public static void months(int a) {
		if (a==0)
		{
			System.out.println("jan");
		} else if (a==1) {
			System.out.println("feb");
		} else if (a==2) {
			System.out.println("mar");
		} else if (a==3) {
			System.out.println("apr");
		} else if (a==4) {
			System.out.println("may");
		} else if (a==5) {
			System.out.println("jun");
		} else if (a==6) {
			System.out.println("jul");
		} else if (a==7) {
			System.out.println("aug");
		} else if (a==8) {
			System.out.println("sep");
		} else if (a==9) {
			System.out.println("oct");
		} else if (a==10) {
			System.out.println("nov");
		} else if (a==11) {
			System.out.println("dec");
		}else {
			System.out.println("enter a number in range 0-11");
		}
	}
	public static void positive(int c[]) {
		for(int val:c) {
		if (val>0) {
			System.out.println("enterd number is positive number");
		}else if(val<0)
		{
			System.out.println("Enterd number is negative number");
		}else
		{
			System.out.println("Zero is Neither negative nor positive");
		}
	}
	}
	
	
	
}