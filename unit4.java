/*
 * 
 * @author Kevin Hernandez
 * @Description this program checks the user age and see if they can drink alcohol
 **/
import java.util.Scanner;
public class unit4 {
	public static void main(String[]args) {
		int age;
		String name;
		String option="can't";
		Scanner in = new Scanner(System.in);
		
		System.out.println("This program will check if you're legal to drink alcohol");
		
		System.out.println("Enter your name: ");
		name = in.next();
		System.out.printf("Ok %s, Enter your age: ",name );
		age = in.nextInt();
		
		if(age >= 21) {
			option ="can";
		}
			System.out.printf("you %s drink alchol", option);
		}
	}
