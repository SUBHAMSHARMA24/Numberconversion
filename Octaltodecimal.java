import java.util.Scanner;
 
public class Octaltodecimal
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    //Input an Octal Number
		System.out.println("Enter a Octal Number");
		int octal = in.nextInt();
		
		//call the recursive function and output the returned result
		System.out.println("Decimal: "+octalToDec(octal,0));
	}
	
	//'i' represents the nth recursive call as well as the
    //(n-1)th digit from left, so it can be used as an exponent
	private static int octalToDec(int oct, int i){
	    //base condition
	    if(oct == 0)
	        return 0;
	        
        //extract digit
        int digit = oct%10;
        
        //multiply with exponential of 8 and add with next recusive call
	    return (int)Math.pow(8,i)*digit + octalToDec(oct/10, ++i);
	}
}
