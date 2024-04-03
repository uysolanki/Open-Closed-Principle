package day20.solid.ocp.problem;

public class Calculation {
	private int number1;
	private int number2;
	private double result;
	
	public Calculation() {}
	
	public Calculation(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public void perform(int operator)
	{
		switch(operator)
		{
		case 1 : this.result=this.number1 +this.number2;
				 System.out.println("Addition is "+this.result);break;
		case 2 : this.result=this.number1 -this.number2;
		 		 System.out.println("Substraction is "+this.result);break;
//		case 3 : this.result=this.number1 -this.number2;
//		 		 System.out.println("Substraction is "+this.result);break;
		case 0 : System.out.println("Shutting Down Application...");
				 System.exit(0);
		}
	}
}
