/*
 * Found ThreadLocal to be cleaner and simpler. 
 * Created this file to keep the dice selector and roller separate
 * to make sure changes in Dice.java won't do anything strange here
 */


import java.util.concurrent.ThreadLocalRandom;

public class Roller {
	public static int d4() {
		int roll = ThreadLocalRandom.current().nextInt(1, 4 + 1);
		return roll;
	}
	public static int d6() {
		int roll = ThreadLocalRandom.current().nextInt(1, 6 + 1);
		return roll;
	}
	public static int d8() {
		int roll = ThreadLocalRandom.current().nextInt(1, 8 + 1);
		return roll;
	}
	public static int d10() {
		int roll = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		return roll;
	}
	public static int d12() {
		int roll = ThreadLocalRandom.current().nextInt(1, 12 + 1);
		return roll;
	}
	public static int d20() {
		int roll = ThreadLocalRandom.current().nextInt(1, 20 + 1);
		return roll;
	}
	public static int d100() {
		int roll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		return roll;
	}
}
