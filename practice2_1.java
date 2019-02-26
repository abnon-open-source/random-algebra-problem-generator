import java.util.Random;

public class equationGen 
{
	static boolean getRandomBoolean() {
		
		double randNumBool = Math.random();
		if (randNumBool < 0.5) {
			return false;
		} else {
			return true;
		}
	}
	static String randomVar() {
		
		Random rand = new Random();
		int coEff = rand.nextInt(10);
		switch (coEff) {
		case 0:
			return "";
		case 1:
			return "";
		case 2:
			return "";
		case 3:
			return "x";
		case 4:
			return "x^2";
		case 5:
			return "x^3";
		case 6:
			return "x^4";
		case 7:
			return "x^5";
		case 8:
			return "x^6";
		case 9:
			return "x^7";
		case 10:
			return "x^8";
		default:
			return "x^2";
		
		}
	}
	static int randomNum1() {
		
		double randNum1 = Math.random()*15;
		return (int) randNum1;
		
	}
	static String nOP() {
		
		boolean isPos = getRandomBoolean();
		if (isPos) {
			return " + ";
		} else {
			return " - ";
		}
	}
	static String equationBlock() {
		
		Random rand = new Random();
		int length = rand.nextInt(10);
		System.out.println("Equation length: " + length);
		
		switch (length) {
		case 0:
			return randomNum1() + randomVar();
		case 1:
			return randomNum1() + randomVar() + nOP() + randomNum1() + randomVar();
		case 2:
			return randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar();
		case 3:
			return randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar();
		case 4:
			return randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar();
		case 5:
			return randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar();
		case 6:
			return randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar();
		case 7:
			return randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar();
		case 8:
			return randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar();
		case 9:
			return randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar();
		case 10: 
			return randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar() + nOP() + randomNum1() + randomVar();
		default:
			return randomNum1() + randomVar();
		}
	}
	public static void main(String[] args) {
		
		equationGen equationObj = new equationGen();
		System.out.println(equationBlock());
		
	}
}