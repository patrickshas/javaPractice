package HiLo;
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int theNumber = (int)(Math.random() * 100 + 1);
		System.out.println( theNumber );
		
		int guess = 0;
		
		while (guess != theNumber) {
			
			System.out.println("Guess a number between 1 and 100");
			
			guess = scan.nextInt();
			
			System.out.println("You entered " + guess + ".");
		}
		
	}

}
