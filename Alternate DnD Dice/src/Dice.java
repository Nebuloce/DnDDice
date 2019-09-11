/*
 * Made this one second to see if another approach would be better.
 * This one is pretty close to the ThreadLocal roller but I find the switch cases
 * to look not as nice.
 */
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quit = 0;
		while(quit == 0){
		System.out.println("\nWhat die size do you want to roll?");
		System.out.print("4");
		System.out.print("  | 6");
		System.out.println("  | 8");
		System.out.print("10");
		System.out.print(" | 12");
		System.out.println(" | 20");
		System.out.println("100");
		System.out.println("0 - Quit");
		
		int choice = input.nextInt();
		int times = 0;	
		
		int answer;
		switch(choice) {
		case 4: System.out.println("How many times?");
				times = input.nextInt();
		
				for (int i = 0; i < times; i++) {
					answer = Roller.answer(choice);
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
				
		case 6: System.out.println("How many times?");
				times = input.nextInt();
			
				for (int i = 0; i < times; i++) {
					answer = Roller.answer(choice);
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
			
		case 8: System.out.println("How many times?");
				times = input.nextInt();
		
				for (int i = 0; i < times; i++) {
					answer = Roller.answer(choice);
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
			
		case 10: System.out.println("How many times?");
				 times = input.nextInt();
		
				for (int i = 0; i < times; i++) {
					answer = Roller.answer(choice);
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
			
		case 12: System.out.println("How many times?");
				 times = input.nextInt();
		
				for (int i = 0; i < times; i++) {
					answer = Roller.answer(choice);
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
			
		case 20: System.out.println("How many times?");
				 times = input.nextInt();
		 
				for (int i = 0; i < times; i++) {
					answer = Roller.answer(choice);
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
			
		case 100: System.out.println("How many times?");
				  times = input.nextInt();
		
				for (int i = 0; i < times; i++) {
					answer = Roller.answer(choice);
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
				
		case 0: quit = 1;
				System.out.println("Good Bye");
				break;
				
		default: System.out.println("Not a valid choice. Please choose between 0 and 7");
		 System.out.println("4  |  6  |  8");
		 System.out.println("8  |  12 |  20");
		 System.out.println("100");

				break;
		}
	}
		
		input.close();
		
	}

}
