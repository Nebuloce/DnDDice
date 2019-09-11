/*
 * Started creating this little program to test how much I remembered from school.
 * Found this to be a much simpler dice roller using ThreadLocal than Math.random or MyRandom
 * and will be using this as my basis for an Android dice roller.
 */
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quit = 0;
		while(quit == 0){
		System.out.println("\nWhat type of dice do you want to roll?");
		System.out.print("1: d4");
		System.out.print("    | 2: d6");
		System.out.println("   | 3: d8");
		System.out.print("4: d10");
		System.out.print("   | 5: d20");
		System.out.println("  | 6: d20");
		System.out.print("7: d100");
		System.out.println("  | 0: Quit");
		int choice = input.nextInt();
		
//		if(choice > 7 || choice <0) {
//			System.out.printf("%d is not a valid choice.\nPlease choose again\n",choice);
//			choice = input.nextInt();
//		}
		
		int answer;
		int times = 0;
		switch(choice) {
		case 1: System.out.println("How many times?");
				times = input.nextInt();
		
				for (int i = 0; i < times; i++) {
					answer = Roller.d4();
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
				
		case 2: System.out.println("How many times?");
				times = input.nextInt();
				
				for (int i = 0; i < times; i++) {
					answer = Roller.d6();
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
			
		case 3: System.out.println("How many times?");
				times = input.nextInt();
				
				for (int i = 0; i < times; i++) {
					answer = Roller.d8();
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
		
		case 4: System.out.println("How many times?");
				times = input.nextInt();
				
				for (int i = 0; i < times; i++) {
					answer = Roller.d10();
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
		
		case 5: System.out.println("How many times?");
				times = input.nextInt();
				
				for (int i = 0; i < times; i++) {
					answer = Roller.d12();
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
				
		case 6: System.out.println("How many times?");
				times = input.nextInt();
				
				for (int i = 0; i < times; i++) {
					answer = Roller.d20();
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
				
		case 7: System.out.println("How many times?");
				times = input.nextInt();
				
				for (int i = 0; i < times; i++) {
					answer = Roller.d100();
					System.out.printf("Roll %d: " + answer, i+1);
					System.out.println("");
				}	
				break;
				
		case 0: quit = 1;
				System.out.println("Good Bye");
				break;
				
		default: System.out.println("Not a valid choice. Please choose between 0 and 7");
				 break;
		}
	}
		
		input.close();
		
	}
	
}
