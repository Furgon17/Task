package module1;
public class Task27 {
	public static void main(String[] args) {
		Task27 obj = new Task27();
		obj.parseAndPrintNumber("488026");
	}

	public void parseAndPrintNumber(String str) {
		int strToInt = Integer.parseInt(str);
		System.out.println(strToInt / 2);
	}
}