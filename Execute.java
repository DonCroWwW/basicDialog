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

		Scanner myScanner= new Scanner(System.in);

		System.out.println("What would you chose between a cat and a dog?");

		String pet = myScanner.nextLine( );

		if (pet.equals("dog"))
		{
			System.out.println("I had a dog named gigica");
		}
		else if(pet.equals("cat"))
			System.out.println("I had a cat named gigicuta");
<<<<<<< HEAD

		System.out.println("Git is gonna be usefull");
=======
		
		System.out.println("Some text from other branch");

>>>>>>> DonCroWww-patch-1
	}

}
