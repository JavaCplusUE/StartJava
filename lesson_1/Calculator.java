public class Calculator
{
	public static void main(String[] args) {
		System.out.println("Калькулятор");
		char sign = '*';
		int numOne = 5;
		int numTwo = 7;
		double result = 0;
		
		if(sign == '+'){
		    result += numOne + numTwo;
		}
		
		if(sign == '-'){
		    result += numOne - numTwo;
		}
		
		if(sign == '*'){
		    result += numOne * numTwo;
		}
		
		if(sign == '/'){
		    result += (double)numOne / (double)numTwo;
		    if(result % 1 != 0){
		        System.out.println(numOne + " " + sign + " " + numTwo + " = " + result);
		        return;
		    }
		}
		
		if(sign == '^'){
		    if(numOne != 0 & numTwo != 0){
		        result += numOne;
		        for (int i = 1;i < numTwo ; i++ ){
                    result *= numOne;
                }  
		    }
		}
		
		if(sign == '%'){
		    result += numOne % numTwo;
		}

		System.out.println(numOne + " " + sign + " " + numTwo + " = " + (int)result);
		
	}
}
