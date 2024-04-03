package day20.solid.ocp.solutionusingabstractclass;

public class Substraction extends ArithmaticOperations {

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
