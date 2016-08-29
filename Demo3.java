/*Purpose: The program is designed to list first 50 prime numbers.*/
/*Author: Zhitao Yin*/
/*Email: zyin3@gsu.edu*/
/*Last update: August 28, 2016*/


import java.util.Scanner;//import class Scanner to read input from console

public class Demo3 {
	public static void main(String[] args){
		//final int NUMBER_OF_PRIMES = 100; // Number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 10; //Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		System.out.println("Program starts");// A good programming practice
		
		//Input how many primes number you want to show and assign it to number_of_primes
		Scanner input = new Scanner (System.in);
		System.out.println("Please input a number X to show the first X prime numbers");
		int number_of_primes = input.nextInt();
		
		
		//Input how many prime numbers you want to display per line
		
		
		
		
		
		//Repeatedly find prime numbers
		while (count < number_of_primes){
			
			//Assume the number if prime
			boolean isPrime = true; //Is the current number prime?
			
			// Test whether number is prime
			for (int divisor = 2; divisor <= number/2; divisor++){
				
				if(number % divisor == 0){ //If true, number is not prime
					isPrime = false; //Set isPrime to false
					break;// Exit the for loop
				}
			}
		//Display the prime number and increase the count
		if (isPrime){
			count++;// Increase the count
			
			if (count % NUMBER_OF_PRIMES_PER_LINE ==0){
				//Display the number and advance to the new line
				System.out.println(number);
			}
			else
				System.out.print(number + " ");
		}
		//Check if the next number is prime
		number++;
		
		}
		
		System.out.println("Program ends");// A good programming practice
	}

}
