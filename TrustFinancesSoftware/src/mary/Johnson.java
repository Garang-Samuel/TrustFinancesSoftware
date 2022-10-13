package mary;

//Use Scanner class to access packages within class java........1//

import java.util.Scanner;

//This class Name........11//

public class Johnson 

{
	
	//Access Scanner members or class privately........4//
	 
	private static Scanner james;
	private static Scanner samuel;

	public static void main(String[]args)
	
	{
		
		//Create new Scanner class  and Capture values from the keyboard.......2//
		
		samuel = new Scanner(System.in);
		
		
		System.out.println("TRUST FINANCE LOAN CALCULATION SOFTWARE");
		
		
		System.out.println("Enter Name Of The Applicant:");
		String name = samuel.next();
		
		
		System.out.println("Enter The Date Of The Loan Application:");
		String loan = samuel.next();
		
		
		//Create new Scanner class and Capture values from the keyboard.......3//
		
		
		james = new Scanner(System.in);
		
		
		System.out.println("Enter The Principle Amount Requested:");
		float principle = james.nextInt();
		
		
		System.out.println("Enter The Loan Rate:");
		int loanrate = james.nextInt();
		 
		
		System.out.println("Enter Loan Repayment Time:");
		int loanrepayment = james.nextInt();
		
		
		//Display the results or print outputs...........5//
		
		
        System.out.println("|Applicant Name:| " + name);
        
		
		System.out.println("|Application Loan Date:| " + loan);
		
		
		System.out.println("|Principle Amount Requested:| " + principle);
		
		
		System.out.println("|Loan Rate:| " + loanrate);
		
		
		System.out.println("|Loan Repayment Time:| " + loanrepayment);
		
		
		//Get the simple interest by multiplying principle, loan rate and loan repayments.......6//
		
		
		float simple_interest = (principle * loanrate / 100 * loanrepayment);
		
		
		System.out.println("|Simple Interest:| " + simple_interest);
		
		
		//Get the total payable by adding simple interest to principle............7//
		
		
		float Total_amount_payable = (simple_interest + principle);
		
		
		System.out.println("|Total Amount Payable is:| " + Total_amount_payable );
		
		
	}

}
