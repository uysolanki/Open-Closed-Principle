package day20.solid.ocp.solutionusinginterface;

import java.util.Scanner;

import day20.solid.ocp.problem.Calculation;

public class OcpSolutionDriverApp {
public static void main(String[] args) {
	
	CalculateManager cm=new CalculateManager();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number 1");
	int n1=sc.nextInt();
	System.out.println("Enter Number 2");
	int n2=sc.nextInt();
	
	Calculation c1=new Calculation(n1,n2);
	int choice;
	do
	{
	System.out.println("******MENU******");
	System.out.println("1. ADDITION");
	System.out.println("2. SUBTRACTION");
	System.out.println("3. MULTIPLICATION");
	System.out.println("0. EXIT");
	
	System.out.println("Enter your choice");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1 : Addition a1=new Addition(n1,n2);
			 cm.calculate(a1);
			 break;
	case 2 : Substraction s1=new Substraction(n1,n2);
	 		 cm.calculate(s1);
	         break;
	case 3 : Multiplication m1=new Multiplication(n1,n2);
	 		 cm.calculate(m1);
	 		 break;	
	case 0 : System.out.println("Application is Shutting down..");
	         System.exit(0);
	
	}
	}while(choice!=0);
	
}
}
