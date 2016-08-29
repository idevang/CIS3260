

//Purpose: The program is designed to list first 50 prime numbers. //forgot extra slash
/*Author: Zhitao Yin*/
/*Email: zyin3@gsu.edu*/
/*Last update: August 28, 2016*/



public class Demo2 { //class needs renaming
	public static void main(String[] args) { 
		final int NUMBER_OF_PRIMES = 50;  //changed from byte to int 
		final int NUMBER_OF_PRIMES_PER_LINE = 10; //missing semi colon 
		int count = 0;	//needs space 
		int number = 2; 

		System.out.println("The fist 50 prime numbers are \n"); //missing the quotes 

while (count < NUMBER_OF_PRIMES){ 
	boolean isPrime = true; 
	for (int divisor = 2; divisor <= number/2; divisor++){ //change 3 to 2 
		if(number % divisor == 0){
			isPrime = false;
			
			break;
		}
	}
			
				if (isPrime){
					count++;
				
				if (count % NUMBER_OF_PRIMES_PER_LINE ==0){		
					
					System.out.println(++number);
				}
				
		else				System.out.print(number++ + " "); //move number to ++number to number++
				}			
		else
			number++;			
	}
}
}
