/**
 * @author Kevin Hernandez
 * @description A guessing game
 * @created 9/26/19
 */
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
	//allows program to use these statics threw out the whole program 
	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[]args ) //main method
	{
		
		//Introduce program
		System.out.println("Welcome to guessing 3000");
		System.out.println("Enter a number from 1-10:");
		int userNumber = in.nextInt();
		int pcNumber = rand.nextInt(10) + 1;
		if( userNumber == pcNumber) {
			System.out.println("You won");
		}else {
			System.out.println("You lost!");
			System.out.println(" The pc chose"+pcNumber);
		}
	}

}
