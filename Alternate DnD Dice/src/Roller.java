/*
 * This is much smaller than ThreadLocal roller but a change here would affect all of the
 * dice options in Dice.java versus the ThreadLocal that has each dice independent.
 */
public class Roller {

	public static int answer(int roll) {
		int answer = (int) (Math.random()*roll)+1;
		return answer;
	}
}


