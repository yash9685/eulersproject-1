
public class eulersQ5new {
	public static void main(String[] args) {
		int numPrimes = 1;
		int numm = 1;
		 
		while (numPrimes < 10001) {
		    numm = numm + 2;
		    if (isPrime(numm)) {
		        numPrimes++;
		    } }
		        System.out.println(numm);
	}
	public static boolean isPrime(int numm) {
	    if (numm <= 1) {
	        return false;
	    }
	 
	    if(numm == 2){
	        return true;
	    }
	 
	    if (numm % 2 == 0) {
	        return false;
	    }
	 
	    int counter = 3;
	 
	    while ((counter * counter) <= numm) {
	        if (numm % counter == 0) {
	            return false;
	        } else {
	            counter +=2;
	        }
	    }
	 
	    return true;
	}
	    }