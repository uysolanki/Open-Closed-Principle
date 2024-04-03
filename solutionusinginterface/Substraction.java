package day20.solid.ocp.solutionusinginterface;

public class Substraction implements ArithmeticOperations {
	
	private int number1;
	private int number2;
	private double result;
	
	public Substraction() {}
	
	public Substraction(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	@Override
	public void perform() 
	{
		this.result=this.number1 - this.number2;
		System.out.println("Substraction is "+this.result);
	}

}
