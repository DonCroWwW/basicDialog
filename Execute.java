/**
 * 
 */
package basicDialog;

import java.util.Scanner;

/**
 * @author Legion
 *
 */
public class Execute {



	/**	
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("Hello over there, what's your name?");
		Scanner myScanner= new Scanner(System.in);
//		String name = myScanner.nextLine();
//		System.out.println("Hi " +name+" how old are u?");
//		int age = myScanner.nextInt();
		System.out.println("What would you chose between a cat and a dog?");

		String pet = myScanner.nextLine( );

		if (pet.equals("dog"))
		{
			System.out.println("I had a dog named gigica");
		}
		else if(pet.equals("cat"))
			System.out.println("I had a cat named gigicuta");


	}

}
