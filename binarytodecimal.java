import java.util.Scanner;
 
public class binarytodecimal
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    
	    //Input the binary number
		System.out.println("Enter a Binary");
		int binary = in.nextInt();
		
		//pass the binary number to the recursive function
		//and print the result returned
		System.out.println("Decimal: "+binToDec(binary, 0));
	}
	
	//'i' represents the nth recursive call as well as
    //nth digit from left, so it can be used as an exponent
    private static int binToDec(int bin, int i){
        //base condition
        if(bin == 0 || bin == 1)
            return (int)Math.pow(2,i)*bin;
        
        //extract digit
        int lastDigit = bin%10;
        
        //return the arithemetic result with next recusive call
        return (int)(Math.pow(2,i) * lastDigit) + binToDec(bin/10, ++i);
     
    }
}
