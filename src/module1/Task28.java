package module1;
public class Task28 {
	public static void main(String[] args) {
		isPalindrome("Was it a cat I saw?");
	}

	public static boolean isPalindrome(String text) {
		boolean a = false;
		String str = text.replaceAll("[^a-zA-Z0-9]", "");
		String strToLower = str.toLowerCase();
		StringBuilder sbStr2 = new StringBuilder(strToLower);
		sbStr2.reverse();
		String  str2 = sbStr2.toString();
		System.out.println(strToLower);
		System.out.println(str2);
		if (strToLower.equals(str2)) {
			a = true;
		}
		System. out. println(a);
		return a;
// System.out.println(str2);

	}
}