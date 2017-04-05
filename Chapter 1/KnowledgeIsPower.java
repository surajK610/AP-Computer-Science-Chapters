/* File:KnowledgeIsPower
 * Exercise 1.4
 * -----------------------
 * This program writes the phrase 
 * "Knowledge is power" on one line,
 * on three lines with one word per line
 * (center relative to each other),
 * and inside a box from the characters = and |.
 */
public class KnowledgeIsPower {
    //This method prints Knowledge is Power in three ways.
	public static void main (String[] args){
		
		//a)prints on one line
		System.out.println("Knowledge is Power");
		
		//white space
		System.out.println("");
		System.out.println("");
		
		//b) prints on three lines one word per line
		System.out.println("Knowledge");
		System.out.println("   is");
		System.out.println("  power");
		
		//white space
		System.out.println("");
		System.out.println("");
		
		//c) prints with a box surrounding made of = and |
		System.out.println("======================");
		System.out.println("| Knowledge is Power |");
		System.out.println("======================");
		
	}

}
