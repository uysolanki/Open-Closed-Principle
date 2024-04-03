package day20.solid.ocp.solutionusingabstractclass;

public class Addition extends ArithmaticOperations{
	
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
