/**
 * 
 * @author Kevin Hernandez
 *
 */
import java.util.Scanner;
public class LoopAssignment {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a number :");
		double n = scnr.nextInt();
		
		for(int i = 1; i <= n ; i++)
		{
			System.out.println(i);
		}
		// print all the squares from 1 to n
		double sqaures;
		System.out.println("Print all the sqaures from 1 to n");
		sqaures = Math.sqrt(n);
		System.out.println(sqaures);
		

	}

}
