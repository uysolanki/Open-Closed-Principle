package day20.solid.ocp.solutionusinginterface;

public class Addition implements ArithmeticOperations{

	private int number1;
	private int number2;
	private double result;
	
	public Addition() {}
	
	public Addition(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	@Override
	public void perform() 
	{
		this.result=this.number1 +this.number2;
		System.out.println("Addition is "+this.result);
	}
	

}
