import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Welcome to Calculator");
     Scanner sc = new Scanner(System.in);
     double num1, num2;
     while(true) {
     System.out.println("Enter the first number:");
     try {
      num1 =sc.nextDouble();
     }
     catch(InputMismatchException e){
    	System.out.println("Invalid input.Please enter a vaild input"); 
    	sc.next();
    	continue;
     }
     System.out.println("Enter the second number:");
     try {
      num2 =sc.nextDouble();
     }
     catch(InputMismatchException e){
    	System.out.println("Invalid input.Please enter a vaild input"); 
     	sc.next();
     	continue;
      }
     
     System.out.println("Enter the operation('+','-','*','/':");
     char operator =sc.next().charAt(0);
     double result;
     
     switch(operator) {
     case '+':
    	 result = num1+num2;
    	 System.out.println("Result:"+result);
    	 break;
     case '-':
    	 result = num1-num2;
    	 System.out.println("Result:"+result);
    	 break;
     case '*':
    	 result = num1*num2;
    	 System.out.println("Result:"+result);
    	 break;
     case '/':
    	  if(num2==0) {
    		  System.out.println("Please enter nonzero number.");
    	  }else {
    	 result = num1/num2;
    	 System.out.println("Result:"+result);
    	 break;
    	  }
     default:
    	 System.out.println("Invalid input");
  	 	 
     }
     
     
    System.out.println("Do you want to continue?");
    String choice =sc.next();
    if(choice.equalsIgnoreCase("no")) {
    	System.out.println("Thank you for using the calculator.");
    	break;
    }
     
     
     }
     sc.close();
	}

}
