/* File: Errors
 * Exercise 1.2
 * ------------------------------------------
 * This program introduces multiple errors to the program from 
 * Test(1.1) and tells error messages the compiler writes or why 
 * if there are no errors messages.
 */
public class Errors 
{
	public static void main (String[] args)
	{
		System.out.println("An Emergency Broadcast");
	}
	//a)In bluejay, the compiler does not report any problems(It automatically changes the name of the original class to be that of the new class).
	//However, in eclipse and most programs the compiler does not recognize the class because capitalization changes variables 
	//and objects in Java (For example, String hello, Hello, and HELLO are all different).
	
	//b)This changes the output when the program is run from "An Emergency Broadcast" to "An emergency Broadcast".
	
	//c)This creates an error that sayig that a ')' is expected after An and changes the color of the text from green to black.
	//It needs the second double quote to know that the text is a string. 
	
	//d)This creates an error message saying "unclosed string literal" and changes the color of the text from green to black
	//because the string is not closed(2nd quotation missing).
	
	//e)This does not create an error message because the method main is not being called anywhere in the code. It just
	//changes the name of the method main to man and because this just starts the program and is never called has no effect.
	
	//f)This creates an error message that it "cannot find symbol- method bogus(java.lang.String)" because there is no method called 
	//bogus that is in the class of System.out(out which is a class of system) in java's usual library java.lang.
	
	//g)This creates an error message saying " ; expected " because it cannot tell that the statement is done without a semicolon.
	
	//h)This created an error message saying "reached end of file while parsing" because there is no class end brace.
	
}
