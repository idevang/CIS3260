public class Assigment1{
	   public static void main(String[] args) {
	    final int NUMBER_OF_PRIMES = 10; //displays number of primes
	    final int NUMBER_OF_PRIMES_PER_LINE = 10;
	    int count= 0;
	    int number =-50;
	    
	    System.out.println("The first 50 prime numbers are \n"); // Writes out The First 50 pimre number are 
	    
	    while (count < NUMBER_OF_PRIMES) {  //counts prime numbers 
	    	boolean isPrime = true;// Is the current number prime?
	    
	    for (int divisor = 2; divisor <= number / 2; divisor++) { //check if number is prime 
	    	if (number % divisor == 0) { 
	    		isPrime = false;
	    		break; //kills loop 
	   }
	}
	   //display prime numbers and increaseing count  
	    if (isPrime) {
	    	count++; // increase the count 
	    	
	    	if (count % NUMBER_OF_PRIMES_PER_LINE == 0){ //displays number and goes to next line
	    		System.out.println(number);
	    }
	    	else
	    		System.out.println(number + " ");
	    }
	    
	    number++;
	    }
	   }
}
