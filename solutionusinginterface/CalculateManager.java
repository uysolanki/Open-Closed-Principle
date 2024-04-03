package day20.solid.ocp.solutionusinginterface;

public class CalculateManager {
	
	public void calculate(ArithmeticOperations operation)
	{
		operation.perform();
	}

}
