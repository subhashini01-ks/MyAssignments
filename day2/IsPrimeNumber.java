package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*iterate through all numbers from 2 to n – 1 and for every number check if it divides
		n. If we find any number that divides, we return false.*/
		int i,num=13;
		boolean isPrime;
		if(num<2)isPrime=false;
		else isPrime=true;
		   for(i=2;i<=num/i;i++){      
		    if(num%i==0){ 
		    	isPrime=false;
		    	break;
		        }      
		   }      
		   if(isPrime)  { System.out.println(num+" is prime number"); }  
	else
	{
		System.out.println(num+" is not a prime number");
		}    
	}
}



//
