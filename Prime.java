// The "Prime" class.
import java.awt.*;
import hsa.Console;

public class Prime
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.print("input a number");
	int input = c.readInt();
	boolean prime = true;
	for(int i = 2; i<(int)Math.round(Math.sqrt(input)); i++){
	    if( input%i == 0){
		prime = false;
		break;
	    
	    }
	}
	for(int i = 1; i<6; i++){
	 c.print(i);            
	}
	c.print("Your number is prime: " + prime);
	// Place your program here.  'c' is the output console
    } // main method
} // Prime class
