package module1;
public class Task29 {
	public static void main(String[] args) {
		String str = "5";
		System.out.println(parseAndSqrt(str));
	}

	public static long parseAndSqrt(String number) {
		long numL = Long.parseLong(number);
		double sqrtNumL = Math.sqrt(numL);
		long result = Math.round(sqrtNumL);
		return result;
	}
}