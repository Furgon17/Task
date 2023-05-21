package module1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task30 {
	public static void main(String[] args) {
		System.out.println(isGmailOrOutlook("hhui776gg@gmail.com"));
	}

	public static boolean isGmailOrOutlook(String email) {
		Pattern p = Pattern.compile("^[a-zA-Z_0-9]+@(gmail||outlook)\\.com$");  //создаем регулярное выражение.
		Matcher m = p.matcher(email); //сравниваем регулярное выражение с адресом почты
		return m.matches(); //метод возвращает true, если адрес почтв соотв. регулярно выражению
	}
}