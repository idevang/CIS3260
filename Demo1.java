/*Purpose: The program is designed to list first 50 prime numbers.*/
/*Author: Zhitao Yin*/
/*Email: zyin3@gsu.edu*/
/*Last update: August 28, 2016*/

//Why do we need good code documentation?
//What is the difference between /**/ and // ?

public class Demo1 { //What is the class name? How to name class? //name of file, and what is called upon 
	public static void main(String[] args){ // What is main method?
			final int NUMBER_OF_PRIMES = 50; // Why final? Why int? Why capitalize the variable name? //final means the constant veriable, and int is a intger or place holder , capitalzie of varible names is good praitce 
			final int NUMBER_OF_PRIMES_PER_LINE = 10; //Why statement terminator? to tell it is the end of the statement 
			int count = 0; // Why space between = and 0 
			int number = 2; // 
			
			System.out.println("The first 50 prime numbers are \n"); // \n means new line is printed  
			
			//What is \n ? new line 
			
			
			
			while (count < NUMBER_OF_PRIMES){ //Why we need a pair of braces? //it is separting 
				
				
				boolean isPrime = true; //What is boolean? data type is a data type with only two possible values: true or false
				
				
				for (int divisor = 2; divisor <= number/2; divisor++){ //What is variable++? 
					//A prime number (or a prime) is a natural number greater than 1 
					//that has no positive divisors other than 1 and itself.
					
					if(number % divisor == 0){ //What is % ? =is the function used to divide 
						isPrime = false; 
						break;
					}
				}
			
			if (isPrime){
				count++;
				
				if (count % NUMBER_OF_PRIMES_PER_LINE ==0){
					
					System.out.println(number++);
				}
				else
					System.out.print(number++ + " ");
			}	//What is the difference between println and print? println prints the line , and print will print out varibles? 
			else
			number++;			
			}				
		}
}
