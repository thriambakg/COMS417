/* program created by ChatGPT (January 2023) bsaed on the prime program in
 our textbook, with prompts from M.Cohen and then  modified by adding (both)
 correct and faulty code by M. Cohen. No guarantee of correctness of program or
 formal specifications were provided. Specifications for purposes of testing and
 expected behavior will  be given on the assignment handout. */

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {

    /* you can uncomment out the main method and run the program from command line if you like.
       For running the test and coverage you should comment this back out */
    
    /*    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PrimeNumberFinder <lowerBound> <upperBound>");
            return;
        }

        int lowerBound = Integer.parseInt(args[0]);
        int upperBound = Integer.parseInt(args[1]);
	int sumofP=0;

        List<Integer> primes = findPrimes(lowerBound, upperBound);
        sumofP=computeSumOfPrimes(primes);
        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ": " + primes);
        System.out.println("Sum of prime numbers between " + lowerBound + " and " + upperBound + ": " + sumofP);
	}*/



    /* method to find primes between (including) two numbers */
    public static List<Integer> findPrimes(int lowerBound, int upperBound) {
        List<Integer> primeNumbers = new ArrayList<>();
	if (lowerBound > upperBound){
		int w = lowerBound;
		lowerBound = upperBound;
		upperBound = w;
		}
        for (int number = lowerBound; number <= upperBound; number++) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }

        }

        return primeNumbers;
    }

    /* method to compute the sum of primes given a list of prime numbers */
   
    public static int computeSumOfPrimes(List<Integer> primes) {
        int sum = 0;
	if(primes.size()>1){
           for (int prime : primes) {
              sum += prime;
        }
	}
	else if(primes.size()==0){
	    return sum;
	}
	else
	    sum=primes.get(0);
        return sum;
    }


    /* method to ask if a single number is prime */
    public static boolean isPrime(int num) {
        if (num <= 1) {   
            return false;
        }

        if (num == 2 || num == 3 || num == 5 || num == 7 || num == 13 || num == 17 || num == 19 || num == 23) {  
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {   
            return false;
        }

        for (int i = 5; i*i <= num; i+=6) {
            if (num % i == 0 || num %(i+2) == 0) {
                return false;
            }
        }

        return true;
    }
}
