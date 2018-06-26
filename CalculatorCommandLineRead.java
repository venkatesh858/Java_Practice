/*
 * HomeTaks 3:
 * Program #2:
 * 
 * Create Calculator which takes two numbers and an operation from command line and ouputs
 * the result of the operation to the console
 */
package task;

public class CalculatorCommandLineRead {

	public static void main(String[] args) {
		String str1=args[0];
		String str2=args[1];
		String str3=args[2];
		System.out.println("Arguments Passed are "+str1+", "+str2+" and "+str3);
		int num1= Integer.parseInt(str1);
		int num2= Integer.parseInt(str2);
		int result;
		
		switch (str3){
			case "addition":
				result=num1+num2;
				System.out.println("Result is: "+result);
				break;
			
			case "subtraction":
				result=num1-num2;
				System.out.println("Result : "+result);
				break;
				
			case "multiplication":
				result=num1*num2;
				System.out.println("Result : "+result);
				break;
			case "division":
				result=num1/num2;
				System.out.println("Result : "+result);
				break;
			case "reminder":
				result=num1%num2;
				System.out.println("Result : "+result);
				break;
			default:
				System.out.println("Pass Correct Calculation in commandline");
		}

		float percentage=(float)((num1*100)/(num1+num2));
		System.out.println("Percentage "+percentage);
	}
}