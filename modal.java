package application;

public class modal
{
	public float calculate(long num1,long num2,String operator)
	{
		switch (operator)
		{
		case "+": return num1+num2;
		case "-": return num1-num2;
		case "*": return num1*num2;
		case "/": return num1/num2;
		case "ex": System.exit(0);//System.exit(0);
		default:
			return 0;
			
		}
		
		
	}

}
