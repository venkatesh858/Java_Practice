/*
 * HomeTask 3:
 * Program #1:
 * 
 * 
 * code which displays in console “Hello, Create code which displays in console 
 * "Hello, NAMME" where NAME is taken from command line
 * 
 */
package task;

public class PrintCommandLineName {

	public static void main(String[] args) {
		for (int i=0;i<args.length;i++){
		System.out.println("Hello, "+args[i]);
		}
	}

}
