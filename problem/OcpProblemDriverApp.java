package day20.solid.ocp.problem;

import java.util.Scanner;

public class OcpProblemDriverApp {
public static void main(String[] args) {
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
	c1.perform(choice);
	}while(choice!=0);
}
}
